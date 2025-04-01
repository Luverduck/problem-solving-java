package baekjoon.src.step01_by_level.lv10_geometry_1.p07_5073;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int edge[] = new int[3];

        String input;
        StringTokenizer st;
        while(true)
        {
            input = br.readLine();
            if(input.equals("0 0 0")) break;
            st = new StringTokenizer(input);

            int edgeSum = 0;
            int edgeMax = 0;
            for(int i = 0; i < 3; ++i)
            {
                edge[i] = Integer.parseInt(st.nextToken());
                edgeSum += edge[i];
                edgeMax = Math.max(edgeMax, edge[i]);
            }

            if(edgeSum - 2 * edgeMax <= 0)
            {
                bw.append("Invalid\n");
                continue;
            }

            if(edge[0] == edge[1] && edge[1] == edge[2])
                bw.append("Equilateral");
            else if(edge[0] == edge[1] || edge[0] == edge[2] || edge[1] == edge[2])
                bw.append("Isosceles ");
            else
                bw.append("Scalene");

            bw.append('\n');
        }

        bw.flush();

        br.close();
        bw.close();
    }
}