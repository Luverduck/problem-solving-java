package Baekjoon.src.solved_ac.s00_by_class.class01.p02577;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nums[] = new int[10];

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int res = A * B * C;
        while(res > 0)
        {
            int digit = res % 10;
            nums[digit]++;
            res /= 10;
        }

        for(var i : nums)
            bw.append(String.valueOf(i)).append('\n');

        bw.flush();
        br.close();
        bw.close();
    }
}
