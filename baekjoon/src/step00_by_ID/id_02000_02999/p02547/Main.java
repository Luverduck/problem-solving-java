package baekjoon.src.step00_by_ID.id_02000_02999.p02547;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; ++t) {
            br.readLine();
            int N = Integer.parseInt(br.readLine());
            long sum = 0;
            for(int n = 0; n < N; ++n) {
                sum += Long.parseLong(br.readLine());
                sum = sum % N == 0 ? 0 : sum % N;
            }
            bw.append(sum == 0 ? "YES" : "NO").append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}