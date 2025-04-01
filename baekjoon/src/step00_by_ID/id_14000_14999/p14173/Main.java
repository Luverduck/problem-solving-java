package baekjoon.src.step00_by_ID.id_14000_14999.p14173;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");

        int xDiffMax = Math.max(Integer.parseInt(first[2]), Integer.parseInt(second[2])) - Math.min(Integer.parseInt(first[0]), Integer.parseInt(second[0]));
        int yDiffMax = Math.max(Integer.parseInt(first[3]), Integer.parseInt(second[3])) - Math.min(Integer.parseInt(first[1]), Integer.parseInt(second[1]));
        int lengthMax = Math.max(xDiffMax, yDiffMax);
        bw.append(String.valueOf(lengthMax * lengthMax));

        bw.flush();
        br.close();
        bw.close();
    }
}