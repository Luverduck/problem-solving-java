package baekjoon.src.step00_by_ID.id_15000_15999.p15080;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] start = br.readLine().split(" : ");
        String[] end = br.readLine().split(" : ");
        int diff = 0;
        for(int i = 0; i < 3; ++i) {
            diff *= 60;
            diff += Integer.parseInt(end[i]) - Integer.parseInt(start[i]);
        }
        if(diff < 0) diff += 24 * 60 * 60;
        bw.append(String.valueOf(diff));

        bw.flush();
        br.close();
        bw.close();
    }
}