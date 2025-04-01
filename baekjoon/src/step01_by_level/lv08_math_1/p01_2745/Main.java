package baekjoon.src.step01_by_level.lv08_math_1.p01_2745;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int NLength = N.length();
        int result = 0;
        for(int i = 0; i < NLength; ++i)
        {
            result *= B;
            char digit = N.charAt(i);
            if(digit >= 'A')
                result += digit - 'A' + 10;
            else
                result += digit - '0';
        }

        bw.append(String.valueOf(result));

        bw.flush();

        bw.close();
        br.close();
    }
}
