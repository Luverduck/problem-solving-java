package Baekjoon.src.step01_by_level.lv03_loop.p03_25304;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        StringTokenizer st;
        for(int i = 0; i < N; ++i)
        {
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        bw.append((X == sum ? "Yes" : "No")).flush();

        br.close();
        bw.close();
    }
}
