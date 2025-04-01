package baekjoon.src.step01_by_level.lv02_conditional.p05_2884;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if(minute < 45)
        {
            hour--;
            minute = minute - 45 + 60;

            if(hour < 0)
                hour = 23;
        }
        else
            minute -= 45;

        bw.append(String.valueOf(hour)).append(" ").append(String.valueOf(minute));
        bw.flush();

        br.close();
    }
}
