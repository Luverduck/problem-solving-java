package baekjoon.src.step00_by_ID.id_02000_02999.p02420;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long N = Integer.parseInt(input[0]);
        long M = Integer.parseInt(input[1]);

        bw.append(String.valueOf(Math.abs(N - M)));

        bw.flush();
        br.close();
        bw.close();
    }
}