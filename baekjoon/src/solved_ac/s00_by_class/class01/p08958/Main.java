package baekjoon.src.solved_ac.s00_by_class.class01.p08958;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String input;
        for(int i = 0; i < N; ++i)
        {
            input = br.readLine();
            if(input == null) break;

            int sum = 0;
            int score = 0;
            for(int j = 0; j < input.length(); ++j)
            {
                if(input.charAt(j) == 'X')
                {
                    score = 0;
                    continue;
                }
                score++;
                sum += score;
            }
            bw.append(String.valueOf(sum)).append('\n');
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
