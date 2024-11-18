package Baekjoon.src.step00_by_ID.p25932;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int n = 0; n < N; ++n) {
            String input = br.readLine();
            boolean mack = false, zack = false;
            String[] nums = input.split(" ");
            for(String num : nums) {
                if(num.equals("18")) mack = true;
                else if(num.equals("17")) zack = true;
            }
            sb.append(input).append('\n');
            if(mack && zack)
                sb.append("both");
            else if(!mack && !zack)
                sb.append("none");
            else
                sb.append(mack ? "mack" : "zack");
            sb.append("\n\n");
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}