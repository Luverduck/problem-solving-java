package baekjoon.src.step01_by_level.lv10_geometry_1.p05_9063;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int xMin = 10001, xMax = -10001;
        int yMin = 10001, yMax = -10001;

        StringTokenizer st;
        for(int n = 0; n < N; ++n)
        {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xMin = Math.min(xMin, x);
            xMax = Math.max(xMax, x);
            yMin = Math.min(yMin, y);
            yMax = Math.max(yMax, y);
        }

        int result = (xMax - xMin) * (yMax - yMin);
        bw.append(String.valueOf(result));


        bw.flush();

        br.close();
        bw.close();
    }
}