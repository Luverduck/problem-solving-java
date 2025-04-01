package baekjoon.src.step00_by_ID.id_26000_26999.p26532;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        double area = 1.0 * X * Y / 4840;
        bw.append(String.valueOf((int)Math.ceil(area / 5)));

        bw.flush();
        br.close();
        bw.close();
    }
}