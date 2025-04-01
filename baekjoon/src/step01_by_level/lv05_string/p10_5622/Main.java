package baekjoon.src.step01_by_level.lv05_string.p10_5622;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int sec = 0;
        for(int i = 0; i < input.length(); ++i)
        {
            char c = input.charAt(i);;
            int diff = c - 'A';
            if(c >= 'S')
                diff = diff - 1;
            if(c >= 'X')
                diff = diff - 1;
            int dial = diff / 3 + 2;
            sec += dial + 1;
        }

        bw.append(String.valueOf(sec));

        bw.flush();

        bw.close();
        br.close();
    }
}
