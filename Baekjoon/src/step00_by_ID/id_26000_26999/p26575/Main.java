package Baekjoon.src.step00_by_ID.id_26000_26999.p26575;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; ++i)
        {
            String input[] = br.readLine().split(" ");
            double d = Double.parseDouble(input[0]);
            double f = Double.parseDouble(input[1]);
            double p = Double.parseDouble(input[2]);
            bw.append("$").append(String.format("%.2f", d * f * p)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
