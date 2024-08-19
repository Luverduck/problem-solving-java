package Baekjoon.src.step01_by_level.lv07_array_2d.p01_2738;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N =  Integer.parseInt(st.nextToken());
        int M =  Integer.parseInt(st.nextToken());

        int arr[][] = new int[N][M];

        for(int t = 0; t < 2; ++t)
        {
            for(int i = 0; i < N; ++i)
            {
                String input = br.readLine();
                st = new StringTokenizer(input);
                for(int j = 0; j < M; ++j)
                    arr[i][j] += Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; ++i) {
            for(int j = 0; j < M; ++j)
                bw.append(String.valueOf(arr[i][j])).append(" ");
            bw.append('\n');
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
