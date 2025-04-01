package baekjoon.src.step00_by_ID.id_32000_32999.p32288;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String ID = br.readLine();
        ID = ID.replace('l', 'L');
        ID = ID.replace('I', 'i');
        bw.append(ID);

        bw.flush();
        br.close();
        bw.close();
    }
}