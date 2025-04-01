package baekjoon.src.step01_by_level.lv10_geometry_1.p02_1085;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int minX = Math.min(w - x, x);
        int minY = Math.min(h - y, y);

        int minDistance = Math.min(minX, minY);

        bw.append(String.valueOf(minDistance));

        bw.flush();

        br.close();
        bw.close();
    }
}
