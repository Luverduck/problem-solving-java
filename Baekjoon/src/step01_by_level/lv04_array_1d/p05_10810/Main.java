package Baekjoon.src.step01_by_level.lv04_array_1d.p05_10810;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N + 1];

        while(true) {
            String temp = br.readLine();
            if(temp == null) break;
            st = new StringTokenizer(temp);
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for(int pos = i; pos <= j; ++pos)
                basket[pos] = k;
        }

        for(int i = 1; i <= N; ++i)
            bw.append(String.valueOf(basket[i])).append(" ");

        bw.flush();

        bw.close();
        br.close();
    }
}
