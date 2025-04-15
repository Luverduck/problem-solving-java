package baekjoon.src.step00_by_ID.id_27000_27999.p27327;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(X * 24));

        bw.flush();
        br.close();
        bw.close();
    }
}