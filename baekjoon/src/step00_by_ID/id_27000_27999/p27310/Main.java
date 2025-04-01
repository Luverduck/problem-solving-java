package baekjoon.src.step00_by_ID.id_27000_27999.p27310;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String emoji = br.readLine();
        int res = emoji.length();
        for(int i = 0; i < emoji.length(); ++i) {
            if(emoji.charAt(i) == ':') res++;
            if(emoji.charAt(i) == '_') res += 5;
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}