package Baekjoon.src.step00_by_ID.p10718;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "강한친구 대한육군";
        for(int i = 0; i < 2; ++i)
            bw.append(str).append('\n');

        bw.flush();

        br.close();
        bw.close();
    }
}
