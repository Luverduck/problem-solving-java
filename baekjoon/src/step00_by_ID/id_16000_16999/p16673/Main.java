package baekjoon.src.step00_by_ID.id_16000_16999.p16673;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int res = 0;
        for(int c = 1; c <= C; ++c)
            res += c * (K + P * c);
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}