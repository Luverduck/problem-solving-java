package Baekjoon.src.step00_by_ID.id_27000_27999.p27294;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int res = 320;
        if(S == 1 || T > 16 || T < 12)
            res = 280;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}