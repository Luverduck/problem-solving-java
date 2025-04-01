package baekjoon.src.step00_by_ID.id_29000_29999.p29807;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] scores = new int[5];
        String[] inputs = br.readLine().split(" ");
        for(int i = 0; i < inputs.length; ++i)
            scores[i] = Integer.parseInt(inputs[i]);

        int res = 0;
        res += Math.abs(scores[0] - scores[2]) * (scores[0] > scores[2] ? 508 : 108);
        res += Math.abs(scores[1] - scores[3]) * (scores[1] > scores[3] ? 212 : 305);
        if(T == 5) res += scores[4] * 707;
        res *= 4763;
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}