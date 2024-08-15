package Baekjoon.src.step01_by_level.lv05_string.p08_1152;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        while(st.hasMoreTokens())
        {
            st.nextToken();
            cnt++;
        }

        bw.append(String.valueOf(cnt));

        bw.flush();

        bw.close();
        br.close();
    }
}