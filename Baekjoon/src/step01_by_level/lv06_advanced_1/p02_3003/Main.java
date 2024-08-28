package Baekjoon.src.step01_by_level.lv06_advanced_1.p02_3003;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[] { 1, 1, 2, 2, 2, 8 };

        String tokens[] = br.readLine().split(" ");

        for(int i = 0; i < tokens.length; ++i)
        {
            arr[i] -= Integer.parseInt(tokens[i]);
            bw.append(String.valueOf(arr[i])).append(" ");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
