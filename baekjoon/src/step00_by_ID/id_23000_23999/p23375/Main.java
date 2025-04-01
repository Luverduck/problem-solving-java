package baekjoon.src.step00_by_ID.id_23000_23999.p23375;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(x + r).append(" ").append(y + r).append('\n');
        sb.append(x + r).append(" ").append(y - r).append('\n');
        sb.append(x - r).append(" ").append(y - r).append('\n');
        sb.append(x - r).append(" ").append(y + r);
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}