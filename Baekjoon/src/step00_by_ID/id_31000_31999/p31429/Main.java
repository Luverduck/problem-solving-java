package Baekjoon.src.step00_by_ID.id_31000_31999.p31429;

import java.io.*;
import java.util.*;;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        switch(N)
        {
            case 1: bw.append("12 1600"); break;
            case 2: bw.append("11 894"); break;
            case 3: bw.append("11 1327"); break;
            case 4: bw.append("10 1311"); break;
            case 5: bw.append("9 1004"); break;
            case 6: bw.append("9 1178"); break;
            case 7: bw.append("9 1357"); break;
            case 8: bw.append("8 837"); break;
            case 9: bw.append("7 1055"); break;
            case 10: bw.append("6 556"); break;
            case 11: bw.append("6 773"); break;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}