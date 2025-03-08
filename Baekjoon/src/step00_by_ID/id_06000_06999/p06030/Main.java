package Baekjoon.src.step00_by_ID.id_06000_06999.p06030;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= P; ++i) {
            if(P % i != 0) continue;
            for(int j = 1; j <= Q; ++j) {
                if(Q % j != 0) continue;
                sb.append(i).append(" ").append(j).append('\n');
            }
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}