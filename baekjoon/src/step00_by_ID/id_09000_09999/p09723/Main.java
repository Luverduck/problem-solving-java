package baekjoon.src.step00_by_ID.id_09000_09999.p09723;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int t = 1; t <= T; ++t) {
            bw.append("Case #").append(String.valueOf(t)).append(": ");
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int maxNum = Math.max(a, Math.max(b, c));
            bw.append(a * a + b * b + c * c == 2 * maxNum * maxNum ? "YES" : "NO").append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}