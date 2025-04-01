package baekjoon.src.step00_by_ID.id_29000_29999.p29736;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int rA = Math.max(A, K - X);
        int rB = Math.min(B, K + X);
        int res = rB - rA + 1;
        bw.append(res > 0 ? String.valueOf(res) : "IMPOSSIBLE");

        bw.flush();
        br.close();
        bw.close();
    }
}