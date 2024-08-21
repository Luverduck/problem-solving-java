package Baekjoon.src.step01_by_level.lv07_array_2d.p03_10798;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arrStr[] = new String[5];

        int maxStrLength = -1;
        for(int i = 0; i < 5; ++i)
        {
            arrStr[i] = br.readLine();
            if(arrStr[i].length() > maxStrLength)
                maxStrLength = arrStr[i].length();
        }

        for(int i = 0; i < maxStrLength; ++i)
        {
            for(int j = 0; j < 5; ++j)
            {
                if(i >= arrStr[j].length()) continue;
                bw.append(arrStr[j].charAt(i));
            }
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
