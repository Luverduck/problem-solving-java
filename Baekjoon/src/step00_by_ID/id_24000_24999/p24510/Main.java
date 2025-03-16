package Baekjoon.src.step00_by_ID.id_24000_24999.p24510;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] targets = { "for", "while" };
        int N = Integer.parseInt(br.readLine());
        int res = 0;
        for(int n = 0; n < N; ++n) {
            String s = br.readLine();
            int temp = 0;
            int idx = 0;
            for(String target : targets) {
                while(true) {
                    idx = s.indexOf(target, idx);
                    if(idx == -1) break;
                    temp++;
                    idx += target.length();
                }
            }
            res = Math.max(res, temp);
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}