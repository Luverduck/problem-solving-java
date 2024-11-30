package Baekjoon.src.step00_by_ID.id_28000_28999.p28691;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        switch(input) {
            case "M":
                bw.append("MatKor");
                break;
            case "W":
                bw.append("WiCys");
                break;
            case "C":
                bw.append("CyKor");
                break;
            case "A":
                bw.append("AlKor");
                break;
            case "$":
                bw.append("$clear");
                break;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}