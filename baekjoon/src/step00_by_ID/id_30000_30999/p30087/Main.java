package baekjoon.src.step00_by_ID.id_30000_30999.p30087;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, String> map = Map.ofEntries(
            Map.entry("Algorithm", "204"),
            Map.entry("DataAnalysis", "207"),
            Map.entry("ArtificialIntelligence", "302"),
            Map.entry("CyberSecurity", "B101"),
            Map.entry("Network", "303"),
            Map.entry("Startup", "501"),
            Map.entry("TestStrategy", "105")
        );

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; ++i)
            bw.append(map.get(br.readLine())).append('\n');

        bw.flush();
        br.close();
        bw.close();
    }
}