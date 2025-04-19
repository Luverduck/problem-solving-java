package baekjoon.src.step00_by_ID.id_23000_23999.p23972;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long K = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());
        if(N == 1) {
            bw.append("-1");
        } else {
            long res = K * N / (N - 1L);
            if(K * N % (N - 1L) != 0) res++;
            bw.append(String.valueOf(res));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}