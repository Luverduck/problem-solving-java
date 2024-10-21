package Baekjoon.src.step00_by_ID.p26574;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i)
        {
            int num = Integer.parseInt(br.readLine());
            bw.append(String.valueOf(num)).append(" ").append(String.valueOf(num)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
