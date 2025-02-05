package Baekjoon.src.step00_by_ID.id_29000_29999.p29699;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "WelcomeToSMUPC";
        int N = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(str.charAt((N - 1) % str.length())));

        bw.flush();
        br.close();
        bw.close();
    }
}