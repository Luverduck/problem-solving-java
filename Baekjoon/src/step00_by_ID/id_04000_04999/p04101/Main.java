package Baekjoon.src.step00_by_ID.id_04000_04999.p04101;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while(true) {
            input = br.readLine();
            if(input.equals("0 0")) break;
            StringTokenizer st = new StringTokenizer(input);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.append(A > B ? "Yes" : "No").append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}