package Baekjoon.src.step00_by_ID.p29731;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sArray = {
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "Never gonna stop"
        };

        int N = Integer.parseInt(br.readLine());
        int cnt = N;
        String S;
        for(int n = 0; n < N; ++n) {
            S = br.readLine();
            for(String sElement : sArray ) {
                if(S.equals(sElement)) {
                    cnt--;
                    break;
                }
            }
        }
        bw.append(cnt != 0 ? "Yes" : "No");

        bw.flush();
        br.close();
        bw.close();
    }
}
