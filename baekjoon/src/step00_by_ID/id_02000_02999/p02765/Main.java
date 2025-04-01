package baekjoon.src.step00_by_ID.id_02000_02999.p02765;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int idx = 1;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double A = Double.parseDouble(st.nextToken());
            double B = Double.parseDouble(st.nextToken());
            double C = Double.parseDouble(st.nextToken());
            if(B == 0) break;
            double mile = A * B * 3.1415927 / 63360;
            double MPH = mile / C * 3600;
            sb.append(String.format("Trip #%d: %.2f %.2f\n", idx++, mile, MPH));
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}