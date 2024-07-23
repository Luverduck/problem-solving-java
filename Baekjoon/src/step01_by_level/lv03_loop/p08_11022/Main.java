package Baekjoon.src.step01_by_level.lv03_loop.p08_11022;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int A, B;
        for(int i = 1; i <= T; ++i)
        {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(A).append(" + ").append(B).append(" = ").append(A + B).append("\n");
        }
        bw.append(sb);

        bw.flush();

        bw.close();
        br.close();
    }
}
