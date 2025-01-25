package Baekjoon.src.step00_by_ID.id_28000_28999.p28249;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int res = 0;
        for(int n = 0; n < N; ++n) {
            String pepper = br.readLine();
            switch(pepper)
            {
                case "Poblano": res += 1500; break;
                case "Mirasol": res += 6000; break;
                case "Serrano": res += 15500; break;
                case "Cayenne": res += 40000; break;
                case "Thai": res += 75000; break;
                case "Habanero": res += 125000; break;
            }
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}