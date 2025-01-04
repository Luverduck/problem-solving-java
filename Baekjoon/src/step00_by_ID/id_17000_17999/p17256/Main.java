package Baekjoon.src.step00_by_ID.id_17000_17999.p17256;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");
        int bx = Integer.parseInt(c[0]) - Integer.parseInt(a[2]);
        int by = Integer.parseInt(c[1]) / Integer.parseInt(a[1]);
        int bz = Integer.parseInt(c[2]) - Integer.parseInt(a[0]);
        bw.append(String.valueOf(bx)).append(" ").append(String.valueOf(by)).append(" ").append(String.valueOf(bz));

        bw.flush();
        br.close();
        bw.close();
    }
}