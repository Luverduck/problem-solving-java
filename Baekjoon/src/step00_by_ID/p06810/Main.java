package Baekjoon.src.step00_by_ID.p06810;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 91;
        for(int i = 1; i <= 3; ++i)
            sum += (i % 2 == 0 ? 3 : 1) * Integer.parseInt(br.readLine());
        bw.append(String.format("The 1-3-sum is %d", sum));

        bw.flush();
        br.close();
        bw.close();
    }
}