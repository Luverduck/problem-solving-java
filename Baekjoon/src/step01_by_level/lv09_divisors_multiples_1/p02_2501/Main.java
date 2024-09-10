package Baekjoon.src.step01_by_level.lv09_divisors_multiples_1.p02_2501;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = 0;
        int idx = 0;
        for(int i = 1; i <= N; ++i)
        {
            if(N % i == 0 && ++idx == K)
            {
                result = i;
                break;
            }
        }
        bw.append(String.valueOf(result));

        bw.flush();

        br.close();
        bw.close();
    }
}