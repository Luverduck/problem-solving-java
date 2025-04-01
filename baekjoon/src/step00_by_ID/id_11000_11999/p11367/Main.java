package baekjoon.src.step00_by_ID.id_11000_11999.p11367;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i) {
            String[] input = br.readLine().split(" ");
            sb.append(input[0]).append(' ');
            int score = Integer.parseInt(input[1]);
            if(score >= 97)
                sb.append("A+");
            else if(score >= 90)
                sb.append("A");
            else if(score >= 87)
                sb.append("B+");
            else if(score >= 80)
                sb.append("B");
            else if(score >= 77)
                sb.append("C+");
            else if(score >= 70)
                sb.append("C");
            else if(score >= 67)
                sb.append("D+");
            else if(score >= 60)
                sb.append("D");
            else
                sb.append("F");
            sb.append('\n');
        }
        bw.append(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
