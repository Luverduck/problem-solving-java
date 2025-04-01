package baekjoon.src.step00_by_ID.id_20000_20999.p20492;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        long case1 = N * 78 / 100;
        long case2 = N * 956 / 1000;
        bw.append(String.valueOf(case1)).append(" ").append(String.valueOf(case2));

        bw.flush();
        br.close();
        bw.close();
    }
}