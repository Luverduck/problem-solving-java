package baekjoon.src.step00_by_ID.id_02000_02999.p02966;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] patterns = {"ABC", "BABC", "CCAABB"};

        int N = Integer.parseInt(br.readLine());
        char[] answer = br.readLine().toCharArray();
        int[] answerCnt = new int[3];
        int answerCntMax = 0;
        for(int i = 0; i < patterns.length; ++i) {
            int pLength = patterns[i].length();
            for(int n = 0; n < N; ++n) {
                int idx = n % pLength;
                if(patterns[i].charAt(idx) != answer[n]) continue;
                answerCnt[i]++;
            }
            answerCntMax = Math.max(answerCntMax, answerCnt[i]);
        }

        bw.append(String.valueOf(answerCntMax)).append('\n');
        if(answerCntMax == answerCnt[0])
            bw.append("Adrian\n");
        if(answerCntMax == answerCnt[1])
            bw.append("Bruno\n");
        if(answerCntMax == answerCnt[2])
            bw.append("Goran\n");

        bw.flush();
        br.close();
        bw.close();
    }
}