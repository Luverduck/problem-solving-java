package baekjoon.src.step00_by_ID.id_09000_09999.p09085;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; ++t) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int res = 0;
            while(st.hasMoreTokens())
                res += Integer.parseInt(st.nextToken());
            bw.append(String.valueOf(res)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}