package baekjoon.src.step00_by_ID.id_11000_11999.p11800;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] case1 = { "", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh" };
        String[] case2 = { "", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh" };

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int t = 1; t <= T; ++t) {
            sb.append("Case ").append(t).append(": ");
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == b)
                sb.append(case2[a]);
            else {
                int nMax = Math.max(a, b);
                int nMin = Math.min(a, b);
                if(nMax == 6 && nMin == 5)
                    sb.append("Sheesh Beesh");
                else
                    sb.append(case1[nMax]).append(" ").append(case1[nMin]);
            }
            sb.append('\n');
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}