package baekjoon.src.step00_by_ID.id_33000_33999.p33612;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = (12 * 2024) + 7;
        int N = Integer.parseInt(br.readLine());
        res += 7 * (N - 1);
        int year = res / 12;
        int month = res % 12;
        bw.append(String.valueOf(year)).append(' ').append(String.valueOf(month + 1));

        bw.flush();
        br.close();
        bw.close();
    }
}