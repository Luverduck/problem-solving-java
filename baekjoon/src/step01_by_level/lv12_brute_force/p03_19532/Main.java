package baekjoon.src.step01_by_level.lv12_brute_force.p03_19532;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int coef[] = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < coef.length; ++i)
            coef[i] = Integer.parseInt(st.nextToken());

        for(int i = -999; i <= 999; ++i)
        {
            for(int j = -999; j <= 999; ++j)
            {
                if(coef[0] * i + coef[1] * j == coef[2] && coef[3] * i + coef[4] * j == coef[5])
                {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
