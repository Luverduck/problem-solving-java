package Baekjoon.src.step00_by_ID.id_28000_28999.p28701;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int res1 = N * (N + 1) / 2;
        int res2 = res1 * res1;

        int res3 = 0;
        for(int i = 1; i <= N; ++i)
            res3 += (int)Math.pow(i, 3);

        StringBuilder sb = new StringBuilder();
        sb.append(res1).append('\n').append(res2).append('\n').append(res3);

        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}