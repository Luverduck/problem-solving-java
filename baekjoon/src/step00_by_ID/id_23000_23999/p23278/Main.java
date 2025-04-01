package baekjoon.src.step00_by_ID.id_23000_23999.p23278;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        String[] input = br.readLine().split(" ");

        int[] scores = new int[N];
        for(int i = 0; i < N; ++i)
            scores[i] = Integer.parseInt(input[i]);
        Arrays.sort(scores);

        double total = 0;
        for(int i = L; i < N - H; ++i)
            total += scores[i];
        System.out.println(total / (N - (L + H)));

        br.close();
    }
}