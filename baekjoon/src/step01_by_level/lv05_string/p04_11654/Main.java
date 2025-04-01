package baekjoon.src.step01_by_level.lv05_string.p04_11654;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.append(String.valueOf(str.charAt(0) - '\0'));

        bw.flush();

        bw.close();
        br.close();
    }
}
