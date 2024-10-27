package Baekjoon.src.step00_by_ID.p23794;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String at = "@";
        sb.append(at.repeat(N + 2)).append('\n');
        for(int r = 2; r < N + 2; ++r)
            sb.append(at).append(" ".repeat(N)).append(at).append('\n');
        sb.append(at.repeat(N + 2)).append('\n');
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
