package baekjoon.src.step00_by_ID.id_05000_05999.p05246;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] cnt = new int[9];
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; ++t) {
            Arrays.fill(cnt, 0);
            int res = 0;
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            for(int n = 2; n < input.length; n += 2) {
                int row = Integer.parseInt(input[n]);
                cnt[row]++;
                res = Math.max(res, cnt[row]);
            }
            bw.append(String.valueOf(res)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}