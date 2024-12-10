package Baekjoon.src.step00_by_ID.id_30000_30999.p30676;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int lambda = Integer.parseInt(br.readLine());
        if(lambda >= 620)
            bw.append("Red");
        else if(lambda >= 590)
            bw.append("Orange");
        else if(lambda >= 570)
            bw.append("Yellow");
        else if(lambda >= 495)
            bw.append("Green");
        else if(lambda >= 450)
            bw.append("Blue");
        else if(lambda >= 425)
            bw.append("Indigo");
        else
            bw.append("Violet");

        bw.flush();
        br.close();
        bw.close();
    }
}