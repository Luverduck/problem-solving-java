package baekjoon.src.step00_by_ID.id_21000_21999.p21567;

import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());
        BigInteger C = new BigInteger(br.readLine());

        String str = A.multiply(B).multiply(C).toString();
        int[] cnt = new int[10];
        for(int i = 0; i < str.length(); ++i)
            cnt[str.charAt(i) - '0']++;
        for(var i : cnt)
            bw.append(String.valueOf(i)).append('\n');

        bw.flush();
        br.close();
        bw.close();
    }
}