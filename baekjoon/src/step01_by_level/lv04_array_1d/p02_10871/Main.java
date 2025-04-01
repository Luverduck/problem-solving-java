package baekjoon.src.step01_by_level.lv04_array_1d.p02_10871;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens())
        {
            String temp = st.nextToken();
            if(X > Integer.parseInt(temp))
                bw.append(temp).append(" ");
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
