package baekjoon.src.step01_by_level.lv12_brute_force.p02_2231;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String NStr = br.readLine();
        int N = Integer.parseInt(NStr);
        int m = N - (NStr.length() * 9);

        int res = 0;
        while(m < N - 1)
        {
            String mStr = String.valueOf(m);
            int mSum = m;
            for(int i = 0; i < mStr.length(); ++i)
                mSum += mStr.charAt(i) - '0';
            if(mSum == N)
            {
                res = m;
                break;
            }
            m++;
        }

        bw.append(String.valueOf(res));

        bw.flush();

        bw.close();
        br.close();
    }
}
