package Baekjoon.src.step00_by_ID.id_30000_30999.p30328;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(n * 4000));

        bw.flush();
        br.close();
        bw.close();
    }
}