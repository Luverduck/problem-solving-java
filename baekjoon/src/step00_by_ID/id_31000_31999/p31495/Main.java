package baekjoon.src.step00_by_ID.id_31000_31999.p31495;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        if(S.length() > 2 && S.charAt(0) == '\"' && S.charAt(S.length() - 1) == '\"')
            bw.append(S.substring(1, S.length() - 1));
        else
            bw.append("CE");

        bw.flush();
        br.close();
        bw.close();
    }
}