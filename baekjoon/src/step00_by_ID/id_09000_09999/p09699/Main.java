package baekjoon.src.step00_by_ID.id_09000_09999.p09699;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int n = 1; n <= N; ++n) {
            int res = -1;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens())
                res = Math.max(res, Integer.parseInt(st.nextToken()));
            sb.append("Case #").append(n).append(": ").append(res).append('\n');
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}