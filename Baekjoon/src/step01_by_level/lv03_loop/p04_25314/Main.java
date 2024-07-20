package Baekjoon.src.step01_by_level.lv03_loop.p04_25314;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int num = N / 4;

        for(int i = 0; i < num; ++i)
            bw.append("long ");
        bw.append("int");

        bw.flush();

        bw.close();
        br.close();
    }
}
