package baekjoon.src.step01_by_level.lv05_string.p07_2675;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 0; i < T; ++i)
        {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            char arr[] = st.nextToken().toCharArray();

            for(char c : arr)
            {
                for(int j = 0; j < N; ++j)
                    bw.append(c);
            }
            bw.append('\n');
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
