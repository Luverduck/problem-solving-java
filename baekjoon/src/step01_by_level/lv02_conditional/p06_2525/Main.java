package baekjoon.src.step01_by_level.lv02_conditional.p06_2525;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int taking = Integer.parseInt(br.readLine());

        minute += taking;
        hour += minute / 60;
        minute %= 60;
        if(hour >= 24)
            hour -= 24;

        bw.append(String.valueOf(hour)).append(" ").append(String.valueOf(minute));
        bw.flush();

        br.close();
        bw.close();
    }
}
