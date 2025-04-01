package baekjoon.src.step01_by_level.lv06_advanced_1.p03_2444;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int row = 2 * N - 1;
        for(int n = 0; n < row; ++n)
        {
            int cntBlank = Math.abs(n - N);
            int cntStar = row - 2 * cntBlank;
            for(int i = 0; i < cntBlank; ++i)
                bw.append(' ');
            for(int i = 0; i < cntStar; ++i)
                bw.append('*');
            bw.append('\n');
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
