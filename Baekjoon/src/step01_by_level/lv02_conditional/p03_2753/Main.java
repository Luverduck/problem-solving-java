package Baekjoon.src.step01_by_level.lv02_conditional.p03_2753;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println(1);
        else
            System.out.println(0);

        br.close();
    }
}
