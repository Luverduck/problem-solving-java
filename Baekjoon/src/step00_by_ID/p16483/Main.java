package Baekjoon.src.step00_by_ID.p16483;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double t = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(Math.round(Math.pow(t, 2) / 4)));

        bw.flush();
        br.close();
        bw.close();
    }
}