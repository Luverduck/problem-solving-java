package Baekjoon.src.solved_ac.s00_by_class.class01.p02475;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int temp = 0;
        while(st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            temp += n * n;
        }
        bw.append(String.valueOf(temp % 10));

        bw.flush();
        br.close();
        bw.close();
    }
}
