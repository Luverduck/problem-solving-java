package baekjoon.src.step00_by_ID.id_27000_27999.p27159;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int res = 0;
        int prev = 0;
        for(int n = 0; n < N; ++n) {
            int cur = Integer.parseInt(nums[n]);
            if(cur == prev) {
                prev++;
                continue;
            }
            res += cur;
            prev = cur + 1;
        }
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}