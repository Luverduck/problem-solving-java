package Baekjoon.src.step00_by_ID.id_27000_27999.p27889;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        switch(input) {
            case "NLCS":
                bw.append("North London Collegiate School");
                break;
            case "BHA":
                bw.append("Branksome Hall Asia");
                break;
            case "KIS":
                bw.append("Korea International School");
                break;
            case "SJA":
                bw.append("St. Johnsbury Academy");
                break;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}