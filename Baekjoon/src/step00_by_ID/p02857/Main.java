package Baekjoon.src.step00_by_ID.p02857;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String codeName;
        for(int i = 1; i <= 5; ++i)
        {
            codeName = br.readLine();
            if(codeName.contains("FBI"))
                sb.append(String.valueOf(i)).append(' ');
        }
        if(sb.length() == 0)
            sb.append("HE GOT AWAY!");
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
