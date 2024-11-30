package Baekjoon.src.step00_by_ID.id_27000_27999.p27389;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double res = 1.0 * n / 4;
        bw.append(String.format("%.2f", res));

        bw.flush();
        br.close();
        bw.close();
    }
}