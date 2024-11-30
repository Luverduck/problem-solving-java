package Baekjoon.src.step00_by_ID.id_02000_02999.p02783;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        double X = Double.parseDouble(input[0]);
        double Y = Double.parseDouble(input[1]);

        double pricePerUnitMin = X / Y;
        int N = Integer.parseInt(br.readLine());
        for(int n = 0; n < N; ++n) {
            input = br.readLine().split(" ");
            X = Double.parseDouble(input[0]);
            Y = Double.parseDouble(input[1]);
            double pricePerUnit = X / Y;
            pricePerUnitMin = Math.min(pricePerUnitMin, pricePerUnit);
        }
        bw.append(String.format("%.2f", pricePerUnitMin * 1000));

        bw.flush();
        br.close();
        bw.close();
    }
}