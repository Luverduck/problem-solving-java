package Baekjoon.src.step01_by_level.lv05_string.p05_11720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int sum = 0;
        for(int i = 0; i < N; ++i)
            sum += input.charAt(i) - '0';

        bw.append(String.valueOf(sum));

        bw.flush();

        bw.close();
        br.close();
    }
}
