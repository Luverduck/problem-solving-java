package Baekjoon.src.step01_by_level.lv10_geometry_1.p08_14215;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a + b <= c)
            c = a + b - 1;
        else if(b + c <= a)
            a = b + c - 1;
        else if(a + c <= b)
            b = a + c - 1;

        bw.append(String.valueOf(a + b + c));

        bw.flush();

        br.close();
        bw.close();
    }
}
