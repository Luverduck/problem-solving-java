package Baekjoon.src.step01_by_level.lv06_advanced_1.p08_25206;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double creditSum = 0;
        double scoreSum = 0;

        while(true)
        {
            String input = br.readLine();
            if(input == null) break;

            String info[] = input.split(" ");

            String grade = info[2];
            if(grade.equals("P")) continue;
            if(grade.equals("F"))
            {
                creditSum += Double.parseDouble(info[1]);
                continue;
            }

            double score = 0;
            switch(grade.charAt(0))
            {
                case 'A':
                    score = 4.0;
                    break;
                case 'B':
                    score = 3.0;
                    break;
                case 'C':
                    score = 2.0;
                    break;
                case 'D':
                    score = 1.0;
                    break;
            }
            if(grade.charAt(1) == '+')
                score += 0.5;

            double credit = Double.parseDouble(info[1]);

            scoreSum += score * credit;
            creditSum += credit;
        }

        bw.append(String.format("%.6f", scoreSum / creditSum));

        bw.flush();

        br.close();
        bw.close();
    }
}
