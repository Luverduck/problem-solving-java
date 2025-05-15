package baekjoon.src.step00_by_ID.id_11000_11999.p11942;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.append("고려대학교");

        bw.flush();
        br.close();
        bw.close();
    }
}