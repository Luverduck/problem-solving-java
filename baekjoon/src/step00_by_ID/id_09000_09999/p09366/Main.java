package baekjoon.src.step00_by_ID.id_09000_09999.p09366;

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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if(A + B + C <= 2 * Math.max(A, Math.max(B, C))) {
                sb.append("invalid!\n");
                continue;
            }
            if(A == B && A == C)
                sb.append("equilateral\n");
            else if(A != B && A != C && B != C)
                sb.append("scalene\n");
            else
                sb.append("isosceles\n");
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}