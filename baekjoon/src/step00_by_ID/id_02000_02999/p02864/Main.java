package baekjoon.src.step00_by_ID.id_02000_02999.p02864;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int resMin = 0, resMax = 0;
        resMin += Integer.parseInt(A.contains("6") ? A.replaceAll("6", "5") : A);
        resMin += Integer.parseInt(B.contains("6") ? B.replaceAll("6", "5") : B);
        resMax += Integer.parseInt(A.contains("5") ? A.replaceAll("5", "6") : A);
        resMax += Integer.parseInt(B.contains("5") ? B.replaceAll("5", "6") : B);
        bw.append(String.valueOf(resMin)).append(" ").append(String.valueOf(resMax));

        bw.flush();
        br.close();
        bw.close();
    }
}