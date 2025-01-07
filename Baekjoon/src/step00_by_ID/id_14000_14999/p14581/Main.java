package Baekjoon.src.step00_by_ID.id_14000_14999.p14581;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String ID = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(":fan::fan::fan:\n:fan::").append(ID).append("::fan:\n:fan::fan::fan:");
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}