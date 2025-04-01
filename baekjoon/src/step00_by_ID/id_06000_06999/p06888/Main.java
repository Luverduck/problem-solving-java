package baekjoon.src.step00_by_ID.id_06000_06999.p06888;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int cnt = (Y - X) / 60;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= cnt; ++i)
            sb.append("All positions change in year ").append(String.valueOf(String.valueOf(X + 60 * i))).append('\n');
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}