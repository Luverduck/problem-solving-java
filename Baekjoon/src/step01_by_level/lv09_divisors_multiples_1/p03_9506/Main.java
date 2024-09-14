package Baekjoon.src.step01_by_level.lv09_divisors_multiples_1.p03_9506;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        StringBuilder sb = new StringBuilder();
        while(true)
        {
            n = Integer.parseInt(br.readLine());
            if(n == -1) break;

            List<Integer> list = new ArrayList<>();
            int divisorSum = 0;
            for(int i = 1; i * i <= n; ++i)
            {
                if(n % i != 0) continue;
                int divisor = n / i;
                list.add(divisor);
                divisorSum += divisor;
                if(n / divisor == divisor) continue;
                list.add(n / divisor);
                divisorSum += n / divisor;
            }
            divisorSum -= n;
            Collections.sort(list);

            sb.append(String.valueOf(n));
            if(divisorSum != n)
                sb.append(" is NOT perfect.");
            else
            {
                sb.append(String.format(" = %d", list.get(0)));
                for(int i = 1; i < list.size() - 1; ++i)
                    sb.append(" + ").append(String.valueOf(list.get(i)));
            }
            sb.append('\n');
        }

        bw.append(sb.toString());

        bw.flush();

        br.close();
        bw.close();
    }
}
