package Baekjoon.src.step00_by_ID.p15814;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] cArray = br.readLine().toCharArray();
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; ++t)
        {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            char temp = cArray[A];
            cArray[A] = cArray[B];
            cArray[B] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : cArray) sb.append(c);
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}