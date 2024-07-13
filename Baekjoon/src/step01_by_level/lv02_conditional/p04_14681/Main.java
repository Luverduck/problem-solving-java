package Baekjoon.src.step01_by_level.lv02_conditional.p04_14681;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x * y > 0) {
            if(x > 0)
                System.out.println(1);
            else
                System.out.println(3);
        }
        else {
            if(x > 0)
                System.out.println(4);
            else
                System.out.println(2);
        }

        br.close();
    }
}
