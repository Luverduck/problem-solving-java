package Baekjoon.src.step00_by_ID.id_28000_28999.p28224;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int res = 0;
        for(int n = 0; n < N; ++n)
            res += Integer.parseInt(br.readLine());
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}