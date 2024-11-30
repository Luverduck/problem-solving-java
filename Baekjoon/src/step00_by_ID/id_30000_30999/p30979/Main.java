package Baekjoon.src.step00_by_ID.id_30000_30999.p30979;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        String flavors[] = br.readLine().split(" ");
        int duration = 0;
        for(int i = 0; i < N; ++i)
            duration += Integer.parseInt(flavors[i]);
        bw.append(T <= duration ? "Padaeng_i Happy" : "Padaeng_i Cry");

        bw.flush();
        br.close();
        bw.close();
    }
}