package Baekjoon.src.step01_by_level.lv04_array_1d.p07_3052;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] remain = new int[42];

        for(int i = 0; i < 10; ++i) {
            int A = Integer.parseInt(br.readLine());
            int idx = A % 42;
            remain[idx]++;
        }

        int count = 0;
        for(int i = 0; i < remain.length; ++i)
            if(remain[i] != 0)
                count++;

        bw.append(String.valueOf(count));

        bw.flush();

        bw.close();
        br.close();
    }
}
