package baekjoon.src.step00_by_ID.id_27000_27999.p27433;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        long res = recur(N);
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }

    static long recur(long n) {
        if(n <= 1L)
            return 1L;
        else
            return n * recur(n - 1L);
    }
}