package baekjoon.src.step01_by_level.lv01_io_and_arithmetics.p08_18108;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Integer.parseInt(br.readLine()) - 543);

        br.close();
    }
}