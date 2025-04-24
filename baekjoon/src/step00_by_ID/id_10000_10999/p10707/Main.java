package baekjoon.src.step00_by_ID.id_10000_10999.p10707;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        int XP = A * P;
        int YP = B;
        if(P > C) YP += D * (P - C);
        bw.append(String.valueOf(Math.min(XP, YP)));

        bw.flush();
        br.close();
        bw.close();
    }
}