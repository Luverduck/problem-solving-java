package baekjoon.src.step00_by_ID.id_06000_06999.p06763;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());
        int diff = speed - limit;
        if(diff <= 0)
            bw.append("Congratulations, you are within the speed limit!");
        else {
            int fine = 0;
            if(diff <= 20) fine = 100;
            else if(diff <= 30) fine = 270;
            else fine = 500;
            bw.append(String.format("You are speeding and your fine is $%d.", fine));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}