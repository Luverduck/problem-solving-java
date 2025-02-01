package Baekjoon.src.step00_by_ID.id_17000_17999.p17284;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int res = 5000;
        while(st.hasMoreTokens()) {
            int button = Integer.parseInt(st.nextToken());
            switch(button) {
                case 1: res -= 500; break;
                case 2: res -= 800; break;
                case 3: res -= 1000; break;
            }
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}