package Baekjoon.src.step00_by_ID.id_14000_14999.p14720;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] rule = { 0, 1, 2 };
        int idx = 0, cnt = 0;
        for(int n = 0; n < N; ++n) {
            int c = Integer.parseInt(st.nextToken());
            if(c != rule[idx % 3]) continue;
            idx++;
            cnt++;
        }
        bw.append(String.valueOf(cnt));

        bw.flush();
        br.close();
        bw.close();
    }
}