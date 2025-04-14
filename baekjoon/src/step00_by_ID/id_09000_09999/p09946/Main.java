package baekjoon.src.step00_by_ID.id_09000_09999.p09946;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int caseNo = 1;
        String X, Y;
        while(true) {
            X = br.readLine();
            Y = br.readLine();
            if(X.equals("END") && Y.equals("END")) break;
            sb.append("Case ").append(caseNo++).append(": ");
            if(X.length() != Y.length()) {
                sb.append("different").append('\n');
                continue;
            }
            int[] cnt = new int['z' - 'a' + 1];
            for(int i = 0; i < X.length(); ++i) {
                cnt[X.charAt(i) - 'a']++;
                cnt[Y.charAt(i) - 'a']--;
            }
            boolean flag = true;
            for(int i : cnt)
                if(i != 0) {
                    flag = false;
                    break;
                }
            sb.append(flag ? "same" : "different").append('\n');
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}