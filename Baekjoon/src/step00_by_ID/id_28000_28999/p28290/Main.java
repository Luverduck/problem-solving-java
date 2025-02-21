package Baekjoon.src.step00_by_ID.id_28000_28999.p28290;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        if(input.equals("fdsajkl;") || input.equals("jkl;fdsa"))
            bw.append("in-out");
        else if(input.equals("asdf;lkj") || input.equals(";lkjasdf"))
            bw.append("out-in");
        else if(input.equals("asdfjkl;"))
            bw.append("stairs");
        else if(input.equals(";lkjfdsa"))
            bw.append("reverse");
        else
            bw.append("molu");

        bw.flush();
        br.close();
        bw.close();
    }
}