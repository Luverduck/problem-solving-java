package baekjoon.src.step01_by_level.lv07_array_2d.p04_2563;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int paper[][] = new int[100][100];

        int N = Integer.parseInt(br.readLine());
        for(int n = 0; n < N; ++n)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            for(int i = x; i < x + 10; ++i)
                for(int j = y; j < y + 10; ++j)
                    paper[i][j] = 1;
        }

        int area = 0;
        for(int i = 0; i < 100; ++i)
            for(int j = 0; j < 100; ++j)
                if(paper[i][j] == 1)
                    area++;

        bw.append(String.valueOf(area));

        bw.flush();

        bw.close();
        br.close();
    }
}
