package Baekjoon.src.step01_by_level.lv03_loop.p01_2739;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("fileio/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i < 10; ++i)
            bw.append(N + " * " + i + " = " + N * i + "\n");

        bw.flush();

        br.close();
        bw.close();
    }
}
