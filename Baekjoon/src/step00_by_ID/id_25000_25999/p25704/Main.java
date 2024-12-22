package Baekjoon.src.step00_by_ID.id_25000_25999.p25704;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        int discount = 0;
        if(N >= 20)
            discount = Math.max(discount, P * 25 / 100);
        if(N >= 15)
            discount = Math.max(discount, 2000);
        if(N >= 10)
            discount = Math.max(discount, P * 10 / 100);
        if(N >= 5)
            discount = Math.max(discount, 500);
        bw.append(String.valueOf(Math.max(P - discount, 0)));

        bw.flush();
        br.close();
        bw.close();
    }
}