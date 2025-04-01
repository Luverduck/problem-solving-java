package baekjoon.src.step01_by_level.lv13_sort.p02_2587;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nums[] = new int[5];
        int numSum = 0;
        for(int i = 0; i < nums.length; ++i)
        {
            nums[i] = Integer.parseInt(br.readLine());
            numSum += nums[i];
        }

        Arrays.sort(nums);

        bw.append(String.valueOf(numSum / 5)).append(" ").append(String.valueOf(nums[2]));

        br.close();
        bw.close();
    }
}