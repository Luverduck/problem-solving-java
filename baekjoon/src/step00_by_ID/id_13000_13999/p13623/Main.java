package baekjoon.src.step00_by_ID.id_13000_13999.p13623;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] values = br.readLine().split(" ");
        if(values[0].equals(values[1]) && values[1].equals(values[2]) && values[0].equals(values[2]))
            bw.append('*');
        else if(values[0].equals(values[1]))
            bw.append('C');
        else if(values[1].equals(values[2]))
            bw.append('A');
        else
            bw.append('B');

        bw.flush();
        br.close();
        bw.close();
    }
}