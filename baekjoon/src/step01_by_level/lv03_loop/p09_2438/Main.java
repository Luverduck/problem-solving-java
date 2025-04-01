package baekjoon.src.step01_by_level.lv03_loop.p09_2438;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; ++i)
        {
            for(int j = 1; j <= i; ++j)
                sb.append("*");
            sb.append("\n");
        }
        bw.append(sb);

        bw.flush();

        bw.close();
        br.close();
    }
}
