package baekjoon.src.step01_by_level.lv08_math_1.p04_2903;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int edges = 1;
        for(int n = 0; n < N; ++n)
            edges *= 2;

        bw.append(String.valueOf((edges + 1) * (edges + 1)));

        bw.flush();

        bw.close();
        br.close();
    }
}
