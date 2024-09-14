package Baekjoon.src.step01_by_level.lv09_divisors_multiples_1.p04_1978;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isPrime[] = new boolean[1001];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i * i <= 1000; ++i)
        {
            if(isPrime[i])
            {
                for(int j = 2 * i; j <= 1000; j += i)
                    isPrime[j] = false;
            }
        }

        int N = Integer.parseInt(br.readLine());
        String nums[] = br.readLine().split(" ");

        int cnt = 0;
        for(int i = 0; i < N; ++i)
        {
            if(isPrime[Integer.parseInt(nums[i])])
                cnt++;
        }

        bw.append(String.valueOf(cnt));

        bw.flush();

        br.close();
        bw.close();
    }
}