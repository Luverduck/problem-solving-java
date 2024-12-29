package Baekjoon.src.step00_by_ID.id_03000_03999.p03004;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()) - 1;
        int count = 2;
        int increment = 2;
        for(int n = 1; n <= N; ++n) {
            count += n % 2 == 0 ? increment++ : increment;
        }
        bw.append(String.valueOf(count));

        bw.flush();
        br.close();
        bw.close();
    }
}