package baekjoon.src.step00_by_ID.id_15000_15999.p15733;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.append("I'm Sexy");

        bw.flush();
        br.close();
        bw.close();
    }
}