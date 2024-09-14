package Baekjoon.src.step01_by_level.lv09_divisors_multiples_1.p05_2581;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean isPrime[] = new boolean[10001];
        Arrays.fill(isPrime, 2, isPrime.length, true);

        for(int i = 2; i * i <= N; ++i)
        {
            if(isPrime[i])
                for(int j = 2 * i; j <= N; j += i)
                    isPrime[j] = false;
        }

        int minPrime = 0;
        int sumPrime = 0;
        for(int i = M; i <= N; ++i)
        {
            if(!isPrime[i]) continue;
            sumPrime += i;
            if(minPrime != 0) continue;
            minPrime = i;
        }

        if(minPrime != 0)
            bw.append(String.valueOf(sumPrime)).append('\n').append(String.valueOf(minPrime));
        else
            bw.append(String.valueOf(-1));

        bw.flush();

        br.close();
        bw.close();
    }
}