package baekjoon.src.step01_by_level.lv02_conditional.p07_2480;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a == b && a == c)
            bw.append(String.valueOf(10000 + (1000 * a)));
        else if(a == b || a == c)
            bw.append(String.valueOf(1000 + (100 * a)));
        else if(b == c)
            bw.append(String.valueOf(1000 + (100 * b)));
        else
            bw.append(String.valueOf(100 * Math.max(Math.max(a, b), c)));

        bw.flush();

        br.close();
        bw.close();
    }
}
