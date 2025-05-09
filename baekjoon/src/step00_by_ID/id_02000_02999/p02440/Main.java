package baekjoon.src.step00_by_ID.id_02000_02999.p02440;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; ++i) {
            for(int j = N - i; j > 0; --j) {
                sb.append("*");
            }
            sb.append("\n");
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}