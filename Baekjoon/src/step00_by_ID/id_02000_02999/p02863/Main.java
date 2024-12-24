package Baekjoon.src.step00_by_ID.id_02000_02999.p02863;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double A, B, C, D;
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        A = Double.parseDouble(st.nextToken());
        B = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        C = Double.parseDouble(st.nextToken());
        D = Double.parseDouble(st.nextToken());

        int cnt_max = 0;
        double value_max = 0;
        for(int i = 0; i < 4; ++i) {
            double value = A / C + B / D;
            if(value_max < value) {
                value_max = value;
                cnt_max = i;
            }
            double temp = A;
            A = C;
            C = D;
            D = B;
            B = temp;
        }
        bw.append(String.valueOf(cnt_max));

        bw.flush();
        br.close();
        bw.close();
    }
}