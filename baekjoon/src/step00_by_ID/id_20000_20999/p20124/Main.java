package baekjoon.src.step00_by_ID.id_20000_20999.p20124;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String res = null;
        int scoreMax = -1;
        StringTokenizer st;
        for(int n = 0; n < N; ++n) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            if(res == null) res = name;
            if(score > scoreMax) {
                res = name;
                scoreMax = score;
            } else if(score == scoreMax && name.compareTo(res) < 0)
                res = name;
        }
        bw.append(res);

        bw.flush();
        br.close();
        bw.close();
    }
}