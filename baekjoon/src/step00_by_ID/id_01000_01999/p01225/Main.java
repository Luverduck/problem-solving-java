package baekjoon.src.step00_by_ID.id_01000_01999.p01225;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] first = new long[10];
        long[] second = new long[10];
        String[] nums = br.readLine().split(" ");
        for(int i = 0; i < nums[0].length(); ++i)
            first[nums[0].charAt(i) - '0']++;
        for(int i = 0; i < nums[1].length(); ++i)
            second[nums[1].charAt(i) - '0']++;

        long res = 0;
        for(int i = 1; i < first.length; ++i) {
            for(int j = 1; j < second.length; ++j) {
                res += (long)(i * j) * (first[i] * second[j]);
            }
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}