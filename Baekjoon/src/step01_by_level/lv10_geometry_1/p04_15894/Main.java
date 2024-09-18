package Baekjoon.src.step01_by_level.lv10_geometry_1.p04_15894;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());

        bw.append(String.valueOf(4 * N));

        bw.flush();

        br.close();
        bw.close();
    }
}
