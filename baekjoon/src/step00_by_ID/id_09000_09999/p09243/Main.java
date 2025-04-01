package baekjoon.src.step00_by_ID.id_09000_09999.p09243;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        char[] source = br.readLine().toCharArray();
        char[] target = br.readLine().toCharArray();

        boolean flag = true;
        boolean isEven = N % 2 == 0;
        for(int i = 0; i < source.length; ++i) {
            if( (isEven && source[i] == target[i]) || (!isEven && source[i] != target[i]) ) continue;
            flag = false;
            break;
        }
        bw.append(flag ? "Deletion succeeded" : "Deletion failed");

        bw.flush();
        br.close();
        bw.close();
    }
}