package Baekjoon.src.step00_by_ID.id_11000_11999.p11006;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; ++t) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int singleLeg = 2 * M - N;
            int pairLeg = M - singleLeg;
            bw.append(String.format("%d %d\n", singleLeg, pairLeg));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}