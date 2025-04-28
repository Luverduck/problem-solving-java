package baekjoon.src.step00_by_ID.id_05000_05999.P05338;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.append("       _.-;;-._\n" +
                "'-..-'|   ||   |\n" +
                "'-..-'|_.-;;-._|\n" +
                "'-..-'|   ||   |\n" +
                "'-..-'|_.-''-._|");

        bw.flush();
        br.close();
        bw.close();
    }
}