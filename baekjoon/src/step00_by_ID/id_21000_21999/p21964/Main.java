package baekjoon.src.step00_by_ID.id_21000_21999.p21964;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        for(int n = 0; n < N; ++n)
            if(n >= N - 5)
                bw.append(S.charAt(n));

        bw.flush();
        br.close();
        bw.close();
    }
}