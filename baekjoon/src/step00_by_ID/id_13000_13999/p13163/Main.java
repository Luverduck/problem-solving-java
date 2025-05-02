package baekjoon.src.step00_by_ID.id_13000_13999.p13163;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int n = 0; n < N; ++n) {
            String[] name = br.readLine().split(" ");
            sb.append("god");
            for(int i = 1; i < name.length; ++i)
                sb.append(name[i]);
            sb.append('\n');
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}