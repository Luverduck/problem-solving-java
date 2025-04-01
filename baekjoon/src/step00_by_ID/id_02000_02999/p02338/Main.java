package baekjoon.src.step00_by_ID.id_02000_02999.p02338;

import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());
        bw.append(String.valueOf(A.add(B))).append('\n');
        bw.append(String.valueOf(A.subtract(B))).append('\n');
        bw.append(String.valueOf(A.multiply(B)));

        bw.flush();
        br.close();
        bw.close();
    }
}