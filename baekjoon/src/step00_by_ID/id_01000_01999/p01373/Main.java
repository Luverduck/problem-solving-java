package baekjoon.src.step00_by_ID.id_01000_01999.p01373;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int res = 0;
        for(int i = 0; i < N.length(); ++i)
        {
            res += N.charAt(i) - '0';
            res *= 8;
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}