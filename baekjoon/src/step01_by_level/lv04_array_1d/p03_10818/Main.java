package baekjoon.src.step01_by_level.lv04_array_1d.p03_10818;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[N];
        for(int i = 0; i < N; ++i)
            nums[i] = Integer.parseInt(st.nextToken());

        int min = 1000001;
        int max = -1000001;
        for(int num : nums)
        {
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }

        bw.append(String.valueOf(min)).append(' ').append(String.valueOf(max));

        bw.flush();

        bw.close();
        br.close();
    }
}
