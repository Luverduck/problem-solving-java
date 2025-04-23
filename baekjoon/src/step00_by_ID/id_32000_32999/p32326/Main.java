package baekjoon.src.step00_by_ID.id_32000_32999.p32326;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int RRR = Integer.parseInt(br.readLine());
        int GGG = Integer.parseInt(br.readLine());
        int BBB = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(3 * RRR + 4 * GGG + 5 * BBB));

        bw.flush();
        br.close();
        bw.close();
    }
}