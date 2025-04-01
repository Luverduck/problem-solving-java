package baekjoon.src.step01_by_level.lv05_string.p06_10809;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int len = S.length();

        for(char c = 'a'; c <= 'z'; ++c) {
            int idx = -1;
            int idxF = -1;
            while(true) {
                idx++;
                if(idx == len) break;
                if(S.charAt(idx) == c) {
                    idxF = idx;
                    break;
                }
            }
            bw.append(String.valueOf(idxF)).append(" ");
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
