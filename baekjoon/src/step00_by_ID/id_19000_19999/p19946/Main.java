package baekjoon.src.step00_by_ID.id_19000_19999.p19946;

import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger N = new BigInteger(br.readLine());
        int res = 64;
        while(N.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            N = N.divide(BigInteger.TWO);
            res--;
        }
        bw.append(String.valueOf(res));
        bw.flush();
        br.close();
        bw.close();
    }
}