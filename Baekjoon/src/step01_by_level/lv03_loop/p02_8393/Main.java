package Baekjoon.src.step01_by_level.lv03_loop.p02_8393;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //System.setIn(new FileInputStream("fileio/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i = 1; i <= n; ++i)
            result += i;

        bw.append(String.valueOf(result));

        bw.flush();

        br.close();
        bw.close();
    }
}
