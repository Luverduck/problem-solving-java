package Baekjoon.src.step00_by_ID.p06840;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int weight[] = new int[3];
        for(int i = 0; i < 3; ++i)
            weight[i] = Integer.parseInt(br.readLine());
        Arrays.sort(weight);
        bw.append(String.valueOf(weight[1]));

        bw.flush();
        br.close();
        bw.close();
    }
}