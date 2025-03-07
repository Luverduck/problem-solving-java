package Baekjoon.src.step00_by_ID.id_09000_09999.p09550;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; ++t) {
            int res = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int n = 0; n < N; ++n) {
                int cnt = Integer.parseInt(st.nextToken());
                res += cnt / K;
            }
            bw.append(String.valueOf(res)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}