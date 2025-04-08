package baekjoon.src.step00_by_ID.id_04000_04999.p04562;

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
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            bw.append(X < Y ? "NO BRAINS" : "MMM BRAINS").append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}