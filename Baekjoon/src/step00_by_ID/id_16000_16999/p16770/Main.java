package Baekjoon.src.step00_by_ID.id_16000_16999.p16770;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] timeStamp = new int[1001];
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int n = 0; n < N; ++n) {
            st = new StringTokenizer(br.readLine());
            int si = Integer.parseInt(st.nextToken());
            int ti = Integer.parseInt(st.nextToken());
            int bi = Integer.parseInt(st.nextToken());
            for(int i = si; i < ti; ++i)
                timeStamp[i] += bi;
        }

        int bMax = 0;
        for(int i : timeStamp)
            bMax = Math.max(bMax, i);
        bw.append(String.valueOf(bMax));

        bw.flush();
        br.close();
        bw.close();
    }
}