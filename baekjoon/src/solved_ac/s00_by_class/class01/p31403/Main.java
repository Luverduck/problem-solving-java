package baekjoon.src.solved_ac.s00_by_class.class01.p31403;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        bw.append(String.valueOf(A + B - C)).append('\n');

        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.append(B);
        bw.append(String.valueOf(Integer.parseInt(sb.toString()) - C));

        bw.flush();
        br.close();
        bw.close();
    }
}
