package baekjoon.src.step00_by_ID.id_30000_30999.p30999;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int res = 0;
        for(int n = 0; n < N; n++) {
            int temp = M;
            String input = br.readLine();
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == 'O') continue;
                temp--;
            }
            if(temp <= M / 2) continue;
            res++;
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}