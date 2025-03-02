package Baekjoon.src.step00_by_ID.id_06000_06999.p06778;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int antenna = Integer.parseInt(br.readLine());
        int eyes = Integer.parseInt(br.readLine());

        if(antenna >= 3 && eyes <= 4)
            bw.append("TroyMartian\n");
        if(antenna <= 6 && eyes >= 2)
            bw.append("VladSaturnian\n");
        if(antenna <= 2 && eyes <= 3)
            bw.append("GraemeMercurian\n");

        bw.flush();
        br.close();
        bw.close();
    }
}