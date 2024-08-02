package Baekjoon.src.step01_by_level.lv04_array_1d.p06_5597;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[31];

        int idx;
        for(int i = 1; i <= 28; ++i) {
            idx = Integer.parseInt(br.readLine());
            arr[idx]++;
        }

        for(int i = 1; i <= 30; ++i) {
            if(arr[i] == 0)
                bw.append(String.valueOf(i)).append('\n');
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
