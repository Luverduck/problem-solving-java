package baekjoon.src.step00_by_ID.id_06000_06999.p06996;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] template = { "%s & %s are NOT anagrams.\n", "%s & %s are anagrams.\n" };

        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; ++t) {
            String[] words = br.readLine().split(" ");
            if(words[0].length() != words[1].length()) {
                bw.append(String.format(template[0], words[0], words[1]));
                continue;
            }
            char[] word1 = words[0].toCharArray();
            char[] word2 = words[1].toCharArray();
            Arrays.sort(word1);
            Arrays.sort(word2);
            String output = Arrays.equals(word1, word2) ? template[1] : template[0];
            bw.append(String.format(output, words[0], words[1]));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
