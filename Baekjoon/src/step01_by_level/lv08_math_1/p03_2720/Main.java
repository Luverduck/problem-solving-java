package Baekjoon.src.step01_by_level.lv08_math_1.p03_2720;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cent[] = new int[] { 25, 10, 5, 1 };

        int T = Integer.parseInt(br.readLine());

        int remain;
        for(int t = 0; t < T; ++t)
        {
            remain = Integer.parseInt(br.readLine());
            for(int i = 0; i < cent.length; ++i)
            {
                bw.append(String.valueOf(remain / cent[i])).append(' ');
                remain %= cent[i];
            }
            bw.append('\n');
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
