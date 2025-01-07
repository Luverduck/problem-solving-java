package Baekjoon.src.step00_by_ID.id_15000_15999.p15232;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        for(int i = 0; i < R; ++i) {
            for(int j = 0; j < C; ++j)
                bw.append('*');
            bw.append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}