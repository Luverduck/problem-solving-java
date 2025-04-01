package baekjoon.src.step01_by_level.lv08_math_1.p06_1193;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        int n = 1;
        while(X > n)
        {
            X -= n;
            n++;
        }

        String value1 = String.valueOf(n - X + 1);
        String value2 = String.valueOf(X);

        if(n % 2 != 0)
            bw.append(value1).append('/').append(value2);
        else
            bw.append(value2).append('/').append(value1);

        bw.flush();

        bw.close();
        br.close();
    }
}
