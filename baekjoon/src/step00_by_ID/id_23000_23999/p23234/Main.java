package baekjoon.src.step00_by_ID.id_23000_23999.p23234;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.append("The world says hello!");

        bw.flush();
        br.close();
        bw.close();
    }
}