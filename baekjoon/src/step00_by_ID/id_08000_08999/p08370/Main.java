package baekjoon.src.step00_by_ID.id_08000_08999.p08370;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n1, k1, n2, k2;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n1 = Integer.parseInt(st.nextToken());
        k1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
        k2 = Integer.parseInt(st.nextToken());
        int res = n1 * k1 + n2 * k2;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}
