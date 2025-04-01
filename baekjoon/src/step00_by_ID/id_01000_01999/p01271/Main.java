package baekjoon.src.step00_by_ID.id_01000_01999.p01271;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());
        bw.append(String.valueOf(n.divide(m))).append('\n').append(String.valueOf(n.remainder(m)));

        bw.flush();
        br.close();
        bw.close();
    }
}