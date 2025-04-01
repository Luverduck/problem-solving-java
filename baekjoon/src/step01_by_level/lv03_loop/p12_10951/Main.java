package baekjoon.src.step01_by_level.lv03_loop.p12_10951;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String temp;
        while(true) {
            temp = br.readLine();
            if(temp == null)
                break;
            st = new StringTokenizer(temp);
            int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.append(String.valueOf(result)).append('\n');
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
