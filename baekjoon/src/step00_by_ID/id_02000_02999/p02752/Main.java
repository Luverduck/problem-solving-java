package baekjoon.src.step00_by_ID.id_02000_02999.p02752;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int nums[] = new int[3];
        for(int i = 0; i < nums.length; ++i)
            nums[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(nums);
        for(int i = 0; i < 3; ++i)
            bw.append(String.valueOf(nums[i])).append(" ");

        bw.flush();
        br.close();
        bw.close();
    }
}