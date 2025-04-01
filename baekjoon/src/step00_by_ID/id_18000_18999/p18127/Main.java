package baekjoon.src.step00_by_ID.id_18000_18999.p18127;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long res = 1 + ((A - 2) * B * (B + 1) / 2) + B;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}