package baekjoon.src.step01_by_level.lv07_array_2d.p02_2566;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nums[][] = new int[9][9];

        StringTokenizer st;
        for(int i = 0; i < 9; ++i)
        {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; ++j)
                nums[i][j] = Integer.parseInt(st.nextToken());
        }

        int max = -1;
        int row = 0, col = 0;
        for(int i = 0; i < 9; ++i)
        {
            for(int j = 0; j < 9; ++j)
            {
                if(nums[i][j] > max)
                {
                    max = nums[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        bw.append(String.valueOf(max)).append('\n');
        bw.append(String.valueOf(row + 1)).append(" ").append(String.valueOf(col + 1));

        bw.flush();

        bw.close();
        br.close();
    }
}
