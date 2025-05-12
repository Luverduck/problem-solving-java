package baekjoon.src.step00_by_ID.id_31000_31999.p31606;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(X + Y + 3));

        bw.flush();
        br.close();
        bw.close();
    }
}