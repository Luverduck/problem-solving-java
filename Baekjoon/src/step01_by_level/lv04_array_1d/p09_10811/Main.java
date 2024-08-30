package Baekjoon.src.step01_by_level.lv04_array_1d.p09_10811;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int basket[] = new int[N + 1];
        for(int i = 1; i < N + 1; ++i)
            basket[i] = i;

        for(int m = 0; m < M; ++m) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            for(int x = 0; x < (j - i) / 2 + 1; ++x) {
                int temp = basket[i + x];
                basket[i + x] = basket[j - x];
                basket[j - x] = temp;
            }
        }

        for(int i = 1; i < N + 1; ++i)
            bw.append(String.valueOf(basket[i])).append(" ");

        bw.flush();

        bw.close();
        br.close();
    }
}
