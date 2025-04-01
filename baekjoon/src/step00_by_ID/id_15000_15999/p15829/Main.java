package baekjoon.src.step00_by_ID.id_15000_15999.p15829;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String S = br.readLine();

        long res = 0;
        long pow = 1;
        for(char c : S.toCharArray()) {
            res += (c - 'a' + 1) * pow;
            pow = (pow * 31L) % 1234567891L;
        }
        bw.append(String.valueOf(res % 1234567891L));

        bw.flush();
        br.close();
        bw.close();
    }
}