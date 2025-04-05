package baekjoon.src.step00_by_ID.id_01000_01999.p01259;

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
            if(input.equals("0")) break;
            StringBuilder sb = new StringBuilder(input);
            bw.append(input.equals(sb.reverse().toString()) ? "yes" : "no").append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}