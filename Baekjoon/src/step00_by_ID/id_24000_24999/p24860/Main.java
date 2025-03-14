package Baekjoon.src.step00_by_ID.id_24000_24999.p24860;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long res = 0L;
        String[] arr;
        arr = br.readLine().split(" ");
        res += Long.parseLong(arr[0]) * Long.parseLong(arr[1]);
        arr = br.readLine().split(" ");
        res += Long.parseLong(arr[0]) * Long.parseLong(arr[1]);
        arr = br.readLine().split(" ");
        res *= Long.parseLong(arr[0]) * Long.parseLong(arr[1]) * Long.parseLong(arr[2]);
        bw.append(String.valueOf(res));

        bw.flush();
        br.close();
        bw.close();
    }
}