package baekjoon.src.step01_by_level.lv09_divisors_multiples_1.p01_5086;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while(true)
        {
            input = br.readLine();
            if(input.equals("0 0")) break;
            StringTokenizer st = new StringTokenizer(input);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            String result;
            if(B % A == 0)
                result = "factor";
            else if(A % B == 0)
                result = "multiple";
            else
                result = "neither";

            bw.append(result).append('\n');
        }

        bw.flush();

        br.close();
        bw.close();
    }
}