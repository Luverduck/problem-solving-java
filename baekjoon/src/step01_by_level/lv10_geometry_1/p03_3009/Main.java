package baekjoon.src.step01_by_level.lv10_geometry_1.p03_3009;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int posX[] = new int[3];
        int posY[] = new int[3];
        String input[];
        for(int i = 0; i < 3; ++i)
        {
            input = br.readLine().split(" ");
            posX[i] = Integer.parseInt(input[0]);
            posY[i] = Integer.parseInt(input[1]);
        }

        int x = posX[0] ^ posX[1] ^ posX[2];
        int y = posY[0] ^ posY[1] ^ posY[2];

        bw.append(String.valueOf(x)).append(" ").append(String.valueOf(y));

        bw.flush();

        br.close();
        bw.close();
    }
}