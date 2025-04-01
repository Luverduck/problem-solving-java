package baekjoon.src.step01_by_level.lv08_math_1.p02_11005;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while(N != 0)
        {
            int digit = N % B;
            if(digit > 9)
                sb.insert(0, (char)(digit - 10 + 'A'));
            else
                sb.insert(0, digit);
            N /= B;
        }

        bw.append(sb.toString());

        bw.flush();

        bw.close();
        br.close();
    }
}