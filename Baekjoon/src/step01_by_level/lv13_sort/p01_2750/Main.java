package Baekjoon.src.step01_by_level.lv13_sort.p01_2750;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정렬할 숫자의 개수
        String N_str = br.readLine();
        int N = Integer.parseInt(N_str);

        // 정렬할 숫자를 배열에 저장
        int[] num = new int[N];
        for(int i = 0; i < N; ++i)
            num[i] = Integer.parseInt(br.readLine());

        // 오름차순 정렬
        Arrays.sort(num);

        // 정렬 결과 출력
        for(int i : num)
            System.out.println(i);

        br.close();
    }
}
