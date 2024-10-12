package Baekjoon.src.step00_by_ID.p23235;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int caseNo = 1;
        while(true)
        {
            String input = br.readLine();
            if(input.equals("0")) break;
            sb.append("Case ").append(caseNo++).append(": Sorting... done!\n");
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}