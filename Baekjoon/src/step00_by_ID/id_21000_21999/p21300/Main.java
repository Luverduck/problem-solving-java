package step00_by_ID.id_21000_21999.p21300;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens())
            res += Integer.parseInt(st.nextToken()) * 5;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}