package Baekjoon.src.step00_by_ID.id_16000_16999.p16430;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.append(String.valueOf(B - A)).append(" ").append(String.valueOf(B));

        bw.flush();

        br.close();
        bw.close();
    }
}