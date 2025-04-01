package baekjoon.src.step00_by_ID.id_10000_10999.p10987;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int cnt = 0;
        for(int i = 0; i < input.length(); ++i) {
            char c = input.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                cnt++;
        }
        bw.append(String.valueOf(cnt));

        bw.flush();
        br.close();
        bw.close();
    }
}