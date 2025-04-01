package baekjoon.src.step01_by_level.lv03_loop.p11_10952;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true)
        {
            String input = br.readLine();
            if(input.charAt(0) == '0')
                break;
            StringTokenizer st = new StringTokenizer(input);

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.append(String.valueOf(A + B)).append("\n");
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
