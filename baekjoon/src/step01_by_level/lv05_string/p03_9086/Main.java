package baekjoon.src.step01_by_level.lv05_string.p03_9086;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String temp = null;
        for(int i = 0; i < N; ++i) {
            temp = br.readLine();
            bw.append(temp.charAt(0));
            bw.append(temp.charAt(temp.length() - 1));
            bw.append('\n');
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
