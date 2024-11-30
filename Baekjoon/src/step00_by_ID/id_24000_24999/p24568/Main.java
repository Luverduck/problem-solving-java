package Baekjoon.src.step00_by_ID.id_24000_24999.p24568;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        int total = 8 * R + 3 * S;

        bw.append(String.valueOf(total - 28));

        bw.flush();
        br.close();
        bw.close();
    }
}