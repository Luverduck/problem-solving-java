package baekjoon.src.step00_by_ID.id_04000_04999.p04880;

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
            if(input.equals("0 0 0")) break;
            StringTokenizer st = new StringTokenizer(input);
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());
            if((a3 - a2) == (a2 - a1))
                bw.append("AP ").append(String.valueOf(a3 + (a3 - a2)));
            else
                bw.append("GP ").append(String.valueOf(a3 * (a3 / a2)));
            bw.append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}