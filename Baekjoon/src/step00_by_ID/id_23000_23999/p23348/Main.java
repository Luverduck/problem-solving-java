package Baekjoon.src.step00_by_ID.id_23000_23999.p23348;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] levelStr = br.readLine().split(" ");
        int[] levels = new int[3];
        for (int i = 0; i < levelStr.length; i++)
            levels[i] = Integer.parseInt(levelStr[i]);

        int maxScore = 0;
        int N = Integer.parseInt(br.readLine());
        for (int n = 0; n < N; n++) {
            int score = 0;
            for (int i = 0; i < 3; ++i) {
                String[] levelCounts = br.readLine().split(" ");
                for (int j = 0; j < 3; ++j)
                    score += levels[j] * Integer.parseInt(levelCounts[j]);
                maxScore = Math.max(maxScore, score);
            }
        }
        bw.append(String.valueOf(maxScore));

        bw.flush();
        br.close();
        bw.close();
    }
}