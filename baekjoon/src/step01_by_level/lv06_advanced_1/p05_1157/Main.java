package baekjoon.src.step01_by_level.lv06_advanced_1.p05_1157;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cntAlphabet[] = new int['Z' - 'A' + 1];

        String str = br.readLine().toUpperCase();
        int strLength = str.length();
        int cntMax = 0;
        for(int i = 0; i < strLength; ++i)
        {
            char ch = str.charAt(i);
            cntAlphabet[ch - 'A']++;
            cntMax = Math.max(cntMax, cntAlphabet[ch - 'A']);
        }

        char result = ' ';
        boolean flag = false;
        for(int i = 0; i < cntAlphabet.length; ++i)
        {
            if(cntAlphabet[i] == 0) continue;
            if(cntAlphabet[i] == cntMax)
            {
                if(flag)
                {
                    result = '?';
                    break;
                }
                result = (char)('A' + i);
                flag = true;
            }
        }

        bw.append(result);

        bw.flush();

        bw.close();
        br.close();
    }
}
