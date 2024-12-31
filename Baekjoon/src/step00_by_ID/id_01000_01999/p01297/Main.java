package Baekjoon.src.step00_by_ID.id_01000_01999.p01297;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int ratioH = Integer.parseInt(st.nextToken());
        int ratioW = Integer.parseInt(st.nextToken());
        double ratioD = Math.sqrt(Math.pow(ratioH, 2) + Math.pow(ratioW, 2));
        int H = (int)(D * ratioH / ratioD);
        int W = (int)(D * ratioW / ratioD);
        bw.append(String.valueOf(H)).append(' ').append(String.valueOf(W));

        bw.flush();
        br.close();
        bw.close();
    }
}