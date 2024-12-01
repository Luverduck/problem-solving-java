package Baekjoon.src.step00_by_ID.id_18000_18999.p18330;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 다음달에 사용할 총 양
        int k = Integer.parseInt(br.readLine()); // 다음달로 이월되는 한도

        // L당 1500에 사용할 수 있는 양 (한도 내)
        // 다음달에 사용할 양 n과 다음달 한도와 이월된 한도의 합 k + 60 중 최소값
        int p = Math.min(n, k + 60);
        // L당 3000에 사용할 수 있는 양 (한도 초과분)
        int q = n - p;

        int res = 1500 * p + 3000 * q;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}