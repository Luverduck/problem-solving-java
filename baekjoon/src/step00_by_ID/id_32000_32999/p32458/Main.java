package baekjoon.src.step00_by_ID.id_32000_32999.p32458;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double d = Double.parseDouble(br.readLine());
        bw.append(String.valueOf((int)d));

        bw.flush();
        br.close();
        bw.close();
    }
}