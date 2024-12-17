package Baekjoon.src.step00_by_ID.id_20000_20999.p20232;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] winner = new String[]{"ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO",
                "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO",
                "ITMO", "PetrSU, ITMO", "SPbSU", "SPbSU",
                "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU",
                "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO"};

        int y = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(winner[y - 1995]));

        bw.flush();
        br.close();
        bw.close();
    }
}