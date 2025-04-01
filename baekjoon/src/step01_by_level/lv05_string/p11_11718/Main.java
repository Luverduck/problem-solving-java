package baekjoon.src.step01_by_level.lv05_string.p11_11718;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while(true)
        {
            input = br.readLine();
            if(input == null) break;
            bw.append(input).append('\n');
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
