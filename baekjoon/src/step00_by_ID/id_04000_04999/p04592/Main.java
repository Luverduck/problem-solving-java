package baekjoon.src.step00_by_ID.id_04000_04999.p04592;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String input;
        while(true) {
            input = br.readLine();
            if(input.equals("0")) break;
            StringTokenizer st = new StringTokenizer(input);
            int N = Integer.parseInt(st.nextToken());
            int prev = -1;
            for(int n = 0; n < N; ++n) {
                int cur = Integer.parseInt(st.nextToken());
                if(cur == prev) continue;
                sb.append(cur).append(' ');
                prev = cur;
            }
            sb.append("$\n");
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}