package baekjoon.src.step00_by_ID.id_05000_05999.p05717;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true) {
            input = br.readLine();
            if(input.equals("0 0")) break;
            st = new StringTokenizer(input);
            int M = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());
            sb.append(M + F).append('\n');
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}