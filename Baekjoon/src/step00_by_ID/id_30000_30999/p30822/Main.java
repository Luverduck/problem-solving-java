package Baekjoon.src.step00_by_ID.id_30000_30999.p30822;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String S = br.readLine();
        String word = "uospc";
        int[] cnt = new int[5];
        for(int i = 0; i < n; ++i) {
            int idx = word.indexOf(S.charAt(i));
            if(idx == -1) continue;
            cnt[idx]++;
        }
        Arrays.sort(cnt);
        bw.append(String.valueOf(cnt[0]));

        bw.flush();
        br.close();
        bw.close();
    }
}