package baekjoon.src.step01_by_level.lv09_divisors_multiples_1.p06_11653;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 2; i <= Math.sqrt(N); ++i)
        {
            while(N % i ==  0)
            {
                bw.append(String.valueOf(i)).append('\n');
                N /= i;
            }
        }

        if(N > 1)
            bw.append(String.valueOf(N));

        bw.flush();

        br.close();
        bw.close();
    }
}