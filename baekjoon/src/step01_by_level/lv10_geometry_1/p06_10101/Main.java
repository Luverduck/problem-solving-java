package baekjoon.src.step01_by_level.lv10_geometry_1.p06_10101;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int angle[] = new int[3];
        int angleSum = 0;
        for(int i = 0; i < 3; ++i)
        {
            angle[i] = Integer.parseInt(br.readLine());
            angleSum += angle[i];
        }

        if(angleSum != 180)
            bw.append("Error");
        else if(angle[0] == angle[1] && angle[0] == angle[2])
            bw.append("Equilateral");
        else if(angle[0] == angle[1] || angle[0] == angle[2] || angle[1] == angle[2])
            bw.append("Isosceles");
        else
            bw.append("Scalene");

        bw.flush();

        br.close();
        bw.close();
    }
}