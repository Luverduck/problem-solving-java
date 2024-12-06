package Baekjoon.src.step00_by_ID.id_20000_20999.p20254;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] scores = { 56, 24, 14, 6 };
        String[] counts = br.readLine().split(" ");
        int res = 0;
        for(int i = 0; i < scores.length; ++i)
            res += scores[i] * Integer.parseInt(counts[i]);
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}