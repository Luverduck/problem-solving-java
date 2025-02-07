package Baekjoon.src.step00_by_ID.id_28000_28999.p28248;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int res = 50 * P - 10 * C;
        if(P > C) res += 500;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}