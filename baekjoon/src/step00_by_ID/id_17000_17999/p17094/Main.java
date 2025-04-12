package Baekjoon.src.step00_by_ID.id_17000_17999.p17094;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int cnt = 0;
        for(int n = 0; n < N; ++n) {
            if(S.charAt(n) == '2') cnt++;
            else cnt--;
        }
        if(cnt == 0)
            bw.append("yee");
        else
            bw.append(cnt > 0 ? "2" : "e");

        bw.flush();
        br.close();
        bw.close();
    }
}