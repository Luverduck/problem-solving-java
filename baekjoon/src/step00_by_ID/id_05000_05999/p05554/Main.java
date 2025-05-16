package baekjoon.src.step00_by_ID.id_05000_05999.p05554;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = 0;
        for(int i = 0; i < 4; ++i)
            total += Integer.parseInt(br.readLine());
        bw.append(String.valueOf(total / 60)).append('\n').append(String.valueOf(total % 60));

        bw.flush();
        br.close();
        bw.close();
    }
}