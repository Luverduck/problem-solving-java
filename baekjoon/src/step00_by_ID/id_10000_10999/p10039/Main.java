package baekjoon.src.step00_by_ID.id_10000_10999.p10039;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int scoreSum = 0;
        for (int i = 0; i < 5; ++i) {
            int score = Integer.parseInt(br.readLine());
            scoreSum += Math.max(score, 40);
        }
        bw.append(String.valueOf(scoreSum / 5));

        bw.flush();
        br.close();
        bw.close();
    }
}