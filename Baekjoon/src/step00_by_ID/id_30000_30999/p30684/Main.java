package Baekjoon.src.step00_by_ID.id_30000_30999.p30684;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for(int n = 0; n < N; ++n) {
            String temp = br.readLine();
            if(temp.length() != 3) continue;
            list.add(temp);
        }
        Collections.sort(list);
        bw.append(list.get(0));

        bw.flush();
        br.close();
        bw.close();
    }
}