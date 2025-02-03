package Baekjoon.src.step00_by_ID.id_30000_30999.p30957;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] cnt = { 0, 0, 0 };
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int n = 0; n < N; ++n) {
            char c = str.charAt(n);
            switch(c) {
                case 'B': cnt[0]++; break;
                case 'S': cnt[1]++; break;
                case 'A': cnt[2]++; break;
            }
        }

        if(cnt[0] == cnt[1] && cnt[1] == cnt[2]) {
            System.out.println("SCU");
            return;
        }

        int cntMax = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        if(cnt[0] == cntMax) bw.append("B");
        if(cnt[1] == cntMax) bw.append("S");
        if(cnt[2] == cntMax) bw.append("A");

        bw.flush();
        br.close();
        bw.close();
    }
}