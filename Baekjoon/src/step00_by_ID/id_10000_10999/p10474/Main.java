package Baekjoon.src.step00_by_ID.id_10000_10999.p10474;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String input;
        StringTokenizer st;
        while(true) {
            input = br.readLine();
            if(input.equals("0 0")) break;
            st = new StringTokenizer(input);
            long A = Integer.parseInt(st.nextToken());
            long B = Integer.parseInt(st.nextToken());
            sb.append(A / B).append(" ").append(A % B).append(" / ").append(B).append('\n');
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}