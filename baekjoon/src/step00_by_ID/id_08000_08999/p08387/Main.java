package baekjoon.src.step00_by_ID.id_08000_08999.p08387;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] origin = br.readLine().toCharArray();
        char[] rewritten = br.readLine().toCharArray();
        int res = 0;
        for(int i = 0; i < n; ++i) {
            if(origin[i] != rewritten[i]) continue;
            res++;
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}