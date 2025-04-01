package baekjoon.src.solved_ac.s00_by_class.class01.p02741;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; ++i)
            sb.append(i).append('\n');
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}