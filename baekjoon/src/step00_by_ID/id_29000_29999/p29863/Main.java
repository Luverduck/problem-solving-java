package baekjoon.src.step00_by_ID.id_29000_29999.p29863;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int first = Integer.parseInt(br.readLine());
        if(first >= 20) first -= 24;
        int second = Integer.parseInt(br.readLine());
        bw.append(String.valueOf(second - first));

        bw.flush();
        br.close();
        bw.close();
    }
}