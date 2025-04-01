package baekjoon.src.step00_by_ID.id_14000_14999.p14264;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long L = Integer.parseInt(br.readLine());
        double res = L * L * Math.sqrt(3) / 4;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}