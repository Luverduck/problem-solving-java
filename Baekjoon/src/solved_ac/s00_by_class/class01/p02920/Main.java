package Baekjoon.src.solved_ac.s00_by_class.class01.p02920;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cur = Integer.parseInt(st.nextToken());
        int asc = 0;
        int desc = 0;
        while(st.hasMoreTokens()) {
            int nex = Integer.parseInt(st.nextToken());
            if(cur + 1 == nex) asc++;
            else if(cur - 1 == nex) desc++;
            cur = nex;
        }
        if(asc == 7) bw.append("ascending");
        else if(desc == 7) bw.append("descending");
        else bw.append("mixed");

        bw.flush();
        br.close();
        bw.close();
    }
}
