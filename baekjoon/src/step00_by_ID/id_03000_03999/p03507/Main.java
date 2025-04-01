package baekjoon.src.step00_by_ID.id_03000_03999.p03507;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = Integer.parseInt(br.readLine());
        int res = 0;
        for(int i = 0; i < 100; ++i) {
            for(int j = 0; j < 100; ++j) {
                if(i + j == index) res++;
            }
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}