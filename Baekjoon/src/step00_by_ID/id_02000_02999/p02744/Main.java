package Baekjoon.src.step00_by_ID.id_02000_02999.p02744;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int inputSize = input.length();
        for(int i = 0; i < inputSize; ++i)
        {
            char c = input.charAt(i);
            if(c < 'a')
                bw.append(Character.toLowerCase(c));
            else
                bw.append(Character.toUpperCase(c));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}