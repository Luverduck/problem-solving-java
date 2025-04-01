package baekjoon.src.step00_by_ID.id_21000_21999.p21867;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int n = 0; n < N; ++n) {
            char c = input.charAt(n);
            if(c != 'J' && c != 'A' && c != 'V') sb.append(c);
        }
        String result = sb.toString();
        bw.append(result.length() != 0 ? result : "nojava");

        bw.flush();
        br.close();
        bw.close();
    }
}