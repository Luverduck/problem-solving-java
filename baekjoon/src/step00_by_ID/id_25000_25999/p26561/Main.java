package baekjoon.src.step00_by_ID.id_25000_25999.p26561;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int n = 0; n < N; ++n) {
            st = new StringTokenizer(br.readLine());
            long p = Long.parseLong(st.nextToken());
            long t = Long.parseLong(st.nextToken());
            p -= (t / 7L);
            p += (t / 4L);
            bw.append(String.valueOf(p)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}