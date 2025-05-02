package baekjoon.src.step00_by_ID.id_05000_05999.p05691;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while(true) {
            s = br.readLine();
            if(s.equals("0 0")) break;
            String[] input = s.split(" ");
            long A = Long.parseLong(input[0]);
            long B = Long.parseLong(input[1]);
            bw.append(String.valueOf(Math.min((A + B) / 2, 3 * Math.min(A, B) - A - B))).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}