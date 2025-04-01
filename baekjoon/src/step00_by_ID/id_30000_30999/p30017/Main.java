package baekjoon.src.step00_by_ID.id_30000_30999.p30017;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        if(A > B + 1)
            A = B + 1;
        else
            B = A - 1;
        bw.append(String.valueOf(A + B));

        bw.flush();
        br.close();
        bw.close();
    }
}
