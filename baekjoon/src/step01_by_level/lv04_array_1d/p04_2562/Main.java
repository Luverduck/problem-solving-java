package baekjoon.src.step01_by_level.lv04_array_1d.p04_2562;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numMax = -1;
        int numMaxIdx = -1;

        String input;
        for(int i = 0; i < 9; ++i)
        {
            input = br.readLine();
            int num = Integer.parseInt(input);
            if(num > numMax)
            {
                numMax = num;
                numMaxIdx = i;
            }
        }

        bw.append(String.valueOf(numMax));
        bw.append('\n');
        bw.append(String.valueOf(numMaxIdx + 1));

        bw.flush();

        br.close();
        bw.close();
    }
}