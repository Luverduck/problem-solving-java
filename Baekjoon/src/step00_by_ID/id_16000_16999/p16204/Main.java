package Baekjoon.src.step00_by_ID.id_16000_16999.p16204;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        bw.append(String.valueOf(Math.min(M, K) + Math.min(N - M, N - K)));

        bw.flush();
        br.close();
        bw.close();
    }
}