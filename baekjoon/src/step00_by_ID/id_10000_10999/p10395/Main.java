package baekjoon.src.step00_by_ID.id_10000_10999.p10395;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] plugs = br.readLine().split(" ");
        String[] outlets = br.readLine().split(" ");
        boolean flag = true;
        for(int i = 0; i < 5; ++i) {
            if(!plugs[i].equals(outlets[i])) continue;
            flag = false;
        }
        bw.append(flag ? "Y" : "N");

        bw.flush();
        br.close();
        bw.close();
    }
}