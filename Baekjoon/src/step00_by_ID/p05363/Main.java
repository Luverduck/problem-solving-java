package Baekjoon.src.step00_by_ID.p05363;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int n = 0; n < N; ++n)
        {
            String input[] = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < input.length; ++i)
                sb.append(input[(i + 2) % input.length]).append(' ');
            sb.append('\n');
            bw.append(sb.toString());
        }

        bw.flush();
        br.close();
        bw.close();
    }
}