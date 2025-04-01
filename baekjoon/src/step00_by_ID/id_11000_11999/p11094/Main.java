package baekjoon.src.step00_by_ID.id_11000_11999.p11094;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String target = "Simon says ";
        int N = Integer.parseInt(br.readLine());
        for(int n = 0; n < N; ++n) {
            String cmd = br.readLine();
            if(!cmd.contains(target)) continue;
            bw.append(cmd.substring(target.length() - 1)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}