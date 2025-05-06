package baekjoon.src.step00_by_ID.id_05000_05999.p05576;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int W = 0, K = 0;
        Integer[] score = new Integer[10];
        for(int i = 0; i < 10; ++i)
            score[i] = Integer.parseInt(br.readLine());
        Arrays.sort(score, Collections.reverseOrder());
        W = score[0] + score[1] + score[2];

        for(int i = 0; i < 10; ++i)
            score[i] = Integer.parseInt(br.readLine());
        Arrays.sort(score, Collections.reverseOrder());
        K = score[0] + score[1] + score[2];
        bw.append(String.valueOf(W)).append(" ").append(String.valueOf(K));

        bw.flush();
        br.close();
        bw.close();
    }
}