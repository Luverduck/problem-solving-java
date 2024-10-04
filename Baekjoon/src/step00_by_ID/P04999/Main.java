package Baekjoon.src.step00_by_ID.P04999;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String me = br.readLine();
        String target = br.readLine();
        if(me.indexOf('h') >= target.indexOf('h'))
            bw.append("go");
        else
            bw.append("no");

        bw.flush();
        br.close();
        bw.close();
    }
}
