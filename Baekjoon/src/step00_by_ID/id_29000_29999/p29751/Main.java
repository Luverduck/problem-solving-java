package Baekjoon.src.step00_by_ID.id_29000_29999.p29751;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double W = Integer.parseInt(st.nextToken());
        double H = Integer.parseInt(st.nextToken());
        bw.append(String.format("%.1f", W * H / 2));

        bw.flush();
        br.close();
        bw.close();
    }
}