package Baekjoon.src.step00_by_ID.id_01000_01999.p01264;

import java.io.*;
import java.util.*;

public class Main {
    public static final String VOWELS = "AEIOUaeiou";
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while(true) {
            input = br.readLine();
            if(input.equals("#")) break;
            int count = 0;
            for(char c : input.toCharArray())
                if(VOWELS.indexOf(c) != -1) count++;
            bw.append(String.valueOf(count)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}