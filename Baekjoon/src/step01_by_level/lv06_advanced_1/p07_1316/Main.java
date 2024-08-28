package Baekjoon.src.step01_by_level.lv06_advanced_1.p07_1316;

import java.io.*;
import java.util.*;

public class Main {

    static boolean checker[] = new boolean['z' - 'a' + 1];

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int n = 0; n < N; ++n)
        {
            String str = br.readLine();
            int strLength = str.length();

            Arrays.fill(checker, false);
            boolean isGroupWord = true;

            int idx = 0;
            while(idx < strLength)
            {
                char ch = str.charAt(idx);
                if(checker[ch - 'a'])
                {
                    isGroupWord = false;
                    break;
                }
                checker[ch - 'a'] = true;
                while(idx < strLength && str.charAt(idx) == ch)
                    idx++;
            }

            if(isGroupWord) cnt++;
        }

        bw.append(String.valueOf(cnt));

        bw.flush();

        bw.close();
        br.close();
    }
}
