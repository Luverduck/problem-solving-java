package baekjoon.src.step01_by_level.lv01_io_and_arithmetics.p09_10430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputstring = br.readLine();
        StringTokenizer st = new StringTokenizer(inputstring, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println( (A + B) % C );
        System.out.println( ((A % C) + (B % C)) % C );
        System.out.println( (A * B) % C );
        System.out.println( ((A % C) * (B % C)) % C );

        br.close();
    }
}
