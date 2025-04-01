package baekjoon.src.step01_by_level.lv08_math_1.p05_2292;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int maxNo = 1;
        int roomCnt = 1;
        while(N > maxNo)
        {
            maxNo += 6 * roomCnt;
            roomCnt++;
        }

        bw.append(String.valueOf(roomCnt));

        bw.flush();

        br.close();
        bw.close();
    }
}