package Baekjoon.src.step01_by_level.lv06_advanced_1.p06_2941;

import java.io.*;
import java.util.*;

public class Main {

    static String[] alphabets = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        for(var alphabet : alphabets)
            str = str.replace(alphabet, "*");

        bw.append(String.valueOf(str.length()));

        bw.flush();

        bw.close();
        br.close();
    }
}
