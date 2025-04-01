package baekjoon.src.step00_by_ID.id_05000_05999.p05524;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input;
        for(int n = 0; n < N; ++n) {
            input = br.readLine();
            bw.append(input.toLowerCase()).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}