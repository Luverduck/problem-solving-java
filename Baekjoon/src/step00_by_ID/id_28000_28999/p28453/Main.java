package Baekjoon.src.step00_by_ID.id_28000_28999.p28453;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] levels = br.readLine().split(" ");
        for(int n = 0; n < N; ++n) {
            int level = Integer.parseInt(levels[n]);
            if(level == 300)  bw.append("1");
            else if(level >= 275) bw.append("2");
            else if(level >= 250) bw.append("3");
            else  bw.append("4");
            bw.append(" ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}