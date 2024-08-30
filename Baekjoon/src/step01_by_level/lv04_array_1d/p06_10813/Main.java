package Baekjoon.src.step01_by_level.lv04_array_1d.p06_10813;

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
        for(int i = 1; i <= N; ++i)
            basket[i] = i;

        while(true) {
            String input = br.readLine();
            if(input == null) break;

            st = new StringTokenizer(input);

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        for(int i = 1; i <= N; ++i)
            bw.append(String.valueOf(basket[i])).append(" ");

        bw.flush();

        bw.close();
        br.close();
    }
}
