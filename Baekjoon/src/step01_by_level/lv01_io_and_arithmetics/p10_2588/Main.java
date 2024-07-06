package Baekjoon.src.step01_by_level.lv01_io_and_arithmetics.p10_2588;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int temp = B;
        while(true)
        {
            System.out.println(A * (temp % 10));
            if(temp / 10 == 0) break;
            temp /= 10;
        }

        System.out.println(A * B);

        br.close();
    }
}