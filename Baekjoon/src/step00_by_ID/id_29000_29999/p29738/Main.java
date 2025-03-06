package Baekjoon.src.step00_by_ID.id_29000_29999.p29738;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t = 1; t <= T; ++t) {
            sb.append("Case #").append(t).append(": ");
            int N = Integer.parseInt(br.readLine());
            if(N <= 25) sb.append("World Finals");
            else if(N <= 1000) sb.append("Round 3");
            else if(N <= 4500) sb.append("Round 2");
            else sb.append("Round 1");
            sb.append("\n");
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}