package baekjoon.src.step00_by_ID.id_05000_05999.p05063;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        long r, e, c;
        for(int n = 0; n < N; ++n) {
            st = new StringTokenizer(br.readLine());
            r = Long.parseLong(st.nextToken());
            e = Long.parseLong(st.nextToken());
            c = Long.parseLong(st.nextToken());
            if(r == e - c)
                bw.append("does not matter");
            else if(r < e - c)
                bw.append("advertise");
            else if(r > e - c)
                bw.append("do not advertise");
            bw.append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}