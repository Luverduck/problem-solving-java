package Baekjoon.src.step01_by_level.lv01_io_and_arithmetics.p11_11382;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long result = 0;
        while(st.hasMoreTokens())
            result += Long.parseLong(st.nextToken());

        System.out.println(result);

        br.close();
    }
}
