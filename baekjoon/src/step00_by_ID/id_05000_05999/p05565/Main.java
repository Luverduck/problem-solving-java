package baekjoon.src.step00_by_ID.id_05000_05999.p05565;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = Integer.parseInt(br.readLine());
        for(int i = 0; i < 9; ++i)
            res -= Integer.parseInt(br.readLine());
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}