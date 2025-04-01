package baekjoon.src.step00_by_ID.id_02000_02999.p02309;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] heights = new int[9];
        int heightSum = 0;
        for(int i = 0; i < 9; ++i) {
            int height = Integer.parseInt(br.readLine());
            heights[i] = height;
            heightSum += height;
        }
        Arrays.sort(heights);

        int idx1 = 0, idx2 = 0;
        for(int i = 0; i < 9; ++i) {
            for(int j = i + 1; j < 9; ++j) {
                if(heightSum - heights[i] - heights[j] != 100) continue;
                idx1 = i;
                idx2 = j;
                break;
            }
        }

        for(int i = 0; i < 9; ++i)
            if(i != idx1 && i != idx2)
                bw.append(String.valueOf(heights[i])).append('\n');

        bw.flush();
        br.close();
        bw.close();
    }
}