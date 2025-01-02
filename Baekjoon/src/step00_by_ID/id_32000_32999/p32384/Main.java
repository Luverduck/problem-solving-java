package Baekjoon.src.step00_by_ID.id_32000_32999.p32384;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        while(N-- > 0)
            bw.append("LoveisKoreaUniversity ");

        bw.flush();
        br.close();
        bw.close();
    }
}