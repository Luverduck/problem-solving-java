package baekjoon.src.step00_by_ID.id_32000_32999.p32951;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(N - 2024));

        bw.flush();
        br.close();
        bw.close();
    }
}