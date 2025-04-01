package baekjoon.src.step00_by_ID.id_25000_25999.p25881;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int baseRate = Integer.parseInt(st.nextToken());
        int additionalRate = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            int KWH = Integer.parseInt(br.readLine());
            int price = KWH < 1000 ? KWH * baseRate : 1000 * baseRate + (KWH - 1000) * additionalRate;
            bw.append(String.valueOf(KWH)).append(' ').append(String.valueOf(price)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}