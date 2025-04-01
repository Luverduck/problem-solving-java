package baekjoon.src.step01_by_level.lv12_brute_force.p01_2798;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M;
        int cards[] = new int[100];

        String NM[] = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; ++i)
            cards[i] = Integer.parseInt(st.nextToken());

        int sumMax = -1;
        int sumTemp = 0;
        for(int i = 0; i < N - 2; ++i)
        {
            for(int j = i + 1; j < N - 1; ++j)
            {
                for(int k = j + 1; k < N; ++k)
                {
                    sumTemp = cards[i] + cards[j] + cards[k];
                    if(sumTemp > M) continue;
                    sumMax = Math.max(sumMax, sumTemp);
                }
            }
        }

        bw.append(String.valueOf(sumMax));

        bw.flush();

        br.close();
        bw.close();
    }
}