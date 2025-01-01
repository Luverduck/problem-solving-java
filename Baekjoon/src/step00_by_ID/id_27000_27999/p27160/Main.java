package Baekjoon.src.step00_by_ID.id_27000_27999.p27160;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cards = new int[4];
        int N = Integer.parseInt(br.readLine());
        for(int n = 0; n < N; ++n) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            int idx = 0;
            switch(key) {
                case "STRAWBERRY":
                    idx = 0;
                    break;
                case "BANANA":
                    idx = 1;
                    break;
                case "LIME":
                    idx = 2;
                    break;
                case "PLUM":
                    idx = 3;
                    break;
            }
            cards[idx] += Integer.parseInt(st.nextToken());
        }

        for(int cnt : cards) {
            if(cnt != 5) continue;
            System.out.println("YES");
            return;
        }
        System.out.println("NO");

        br.close();
    }
}