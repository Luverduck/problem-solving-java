package baekjoon.src.step00_by_ID.id_32000_32999.p32314;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = Double.parseDouble(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double w = Double.parseDouble(st.nextToken());
        double v = Double.parseDouble(st.nextToken());
        bw.append(a <= w / v ? "1" : "0");

        bw.flush();
        br.close();
        bw.close();
    }
}