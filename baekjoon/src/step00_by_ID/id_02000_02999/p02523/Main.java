package baekjoon.src.step00_by_ID.id_02000_02999.p02523;

import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int row = 2 * N - 1;
        for(int i = 1; i <= row; ++i) {
            for(int j = 1; j <= N - Math.abs(N - i); ++j)
                bw.append("*");
            bw.append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}