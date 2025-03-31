package Baekjoon.src.step00_by_ID.id_12000_12999.p12780;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String H = br.readLine();
        String N = br.readLine();
        int cnt = (H.length() - H.replace(N, "").length()) / N.length();
        bw.append(String.valueOf(cnt));

        bw.flush();
        br.close();
        bw.close();
    }
}