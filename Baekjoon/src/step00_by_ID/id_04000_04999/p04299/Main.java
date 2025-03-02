package Baekjoon.src.step00_by_ID.id_04000_04999.p04299;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if((A + B) % 2 == 0 && A >= B)
            bw.append(String.valueOf((A + B) / 2)).append(" ").append(String.valueOf(((A + B) / 2) - B));
        else
            bw.append("-1");

        bw.flush();
        br.close();
        bw.close();
    }
}