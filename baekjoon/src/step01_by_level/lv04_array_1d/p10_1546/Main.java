package baekjoon.src.step01_by_level.lv04_array_1d.p10_1546;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int scoreMax = -1;
        int scoreSum = 0;
        for(int i = 0; i < N; ++i) {
            int score = Integer.parseInt(st.nextToken());
            scoreMax = Math.max(scoreMax, score);
            scoreSum += score;
        }

        bw.append(String.valueOf((double)scoreSum / scoreMax * 100 / N));

        bw.flush();

        br.close();
        bw.close();
    }
}
