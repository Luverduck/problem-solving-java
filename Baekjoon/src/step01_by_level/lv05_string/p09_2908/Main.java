package Baekjoon.src.step01_by_level.lv05_string.p09_2908;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder A = new StringBuilder(st.nextToken());
        StringBuilder B = new StringBuilder(st.nextToken());

        int numA = Integer.parseInt(A.reverse().toString());
        int numB = Integer.parseInt(B.reverse().toString());

        bw.append(String.valueOf( Math.max(numA, numB) ));

        bw.flush();

        bw.close();
        br.close();
    }
}
