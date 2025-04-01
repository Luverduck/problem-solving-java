package baekjoon.src.step01_by_level.lv08_math_1.p07_2869;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int validHeight = V - A;

        int days = validHeight / (A - B) + 1;
        if(validHeight % (A - B) != 0) days++;

        bw.append(String.valueOf(days));

        bw.flush();

        bw.close();
        br.close();
    }
}
