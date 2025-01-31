package Baekjoon.src.step00_by_ID.id_25000_25999.p25828;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int g = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int case1 = g * p;
        int case2 = g + t * p;
        bw.append(case1 == case2 ? "0" : (case1 < case2 ? "1" : "2"));

        bw.flush();
        br.close();
        bw.close();
    }
}