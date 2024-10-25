package Baekjoon.src.step00_by_ID.p26307;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int HH = Integer.parseInt(st.nextToken()) - 9;
        int MM = Integer.parseInt(st.nextToken());
        int res = (60 * HH) + MM;

        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}