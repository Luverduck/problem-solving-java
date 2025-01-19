package Baekjoon.src.step00_by_ID.id_20000_20999.p20215;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        double res = (w + h) - Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}