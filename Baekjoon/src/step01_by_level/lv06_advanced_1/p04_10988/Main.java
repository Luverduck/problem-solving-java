package Baekjoon.src.step01_by_level.lv06_advanced_1.p04_10988;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String strOrigin = br.readLine();

        StringBuilder sb = new StringBuilder(strOrigin);
        String strReversed = sb.reverse().toString();

        int isPalindrome = strOrigin.equals(strReversed) ? 1 : 0;

        bw.append(String.valueOf(isPalindrome));

        bw.flush();

        br.close();
        bw.close();
    }
}