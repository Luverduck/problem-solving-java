package step00_by_ID.id_15000_15999.p15128;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double p1 = Double.parseDouble(st.nextToken());
        double q1 = Double.parseDouble(st.nextToken());
        double p2 = Double.parseDouble(st.nextToken());
        double q2 = Double.parseDouble(st.nextToken());

        double P = p1 * p2;
        double Q = q1 * q2;
        bw.append(P % (2 * Q) == 0 ? '1' : '0');

        bw.flush();
        br.close();
        bw.close();
    }
}