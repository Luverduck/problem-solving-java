package baekjoon.src.step00_by_ID.id_05000_05999.p05220;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int n = 0; n < N; ++n) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int check = Integer.parseInt(st.nextToken());
            int cnt = 0;
            while(number > 0) {
                if(number % 2 == 1) cnt++;
                number /= 2;
            }
            bw.append(cnt % 2 == check ? "Valid" : "Corrupt").append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}