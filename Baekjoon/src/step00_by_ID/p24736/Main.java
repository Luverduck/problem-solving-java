package Baekjoon.src.step00_by_ID.p24736;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] scoreBoard = { 6, 3, 2, 1, 2 };

        for(int t = 0; t < 2; ++t) {
            int score = 0;
            String[] input = br.readLine().split(" ");
            for(int i = 0; i < input.length; ++i)
                score += Integer.parseInt(input[i]) * scoreBoard[i];
            bw.append(String.valueOf(score)).append(' ');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}