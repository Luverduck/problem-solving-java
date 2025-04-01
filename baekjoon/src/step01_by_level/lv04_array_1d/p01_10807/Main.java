package baekjoon.src.step01_by_level.lv04_array_1d.p01_10807;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; ++i)
            arr[i] = Integer.parseInt(st.nextToken());

        int target = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < N; ++i)
        {
            if(arr[i] == target)
                count++;
        }

        System.out.println(count);

        br.close();
    }
}
