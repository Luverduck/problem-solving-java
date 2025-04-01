package baekjoon.src.step00_by_ID.id_02000_02999.p02083;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String in;
        while(true) {
            in = br.readLine();
            if(in.equals("# 0 0")) break;
            StringTokenizer st = new StringTokenizer(in);
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            sb.append(name).append(" ").append(age > 17 || weight >= 80 ? "Senior" : "Junior").append('\n');
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}