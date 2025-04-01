package baekjoon.src.step00_by_ID.id_30000_30999.p30468;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] stats = br.readLine().split(" ");
        int sum = 0;
        for(int i = 0; i < stats.length - 1; ++i)
            sum += Integer.parseInt(stats[i]);
        int sumTarget = Integer.parseInt(stats[stats.length - 1]) * 4;
        bw.append(String.valueOf(sumTarget > sum ? sumTarget - sum : 0));

        bw.flush();
        br.close();
        bw.close();
    }
}