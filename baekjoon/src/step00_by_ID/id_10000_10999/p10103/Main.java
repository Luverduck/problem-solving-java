package baekjoon.src.step00_by_ID.id_10000_10999.p10103;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int A = 100, B = 100;
        StringTokenizer st;
        for(int n = 0; n < N; ++n) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a > b)
                B -= a;
            else if(a < b)
                A -= b;
        }
        bw.append(String.valueOf(A)).append('\n').append(String.valueOf(B));

        bw.flush();
        br.close();
        bw.close();
    }
}