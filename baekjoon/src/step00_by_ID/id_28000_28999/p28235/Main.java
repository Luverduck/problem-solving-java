package baekjoon.src.step00_by_ID.id_28000_28999.p28235;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("fileio/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        switch(input)
        {
            case "SONGDO":
                bw.append("HIGHSCHOOL");
                break;
            case "CODE":
                bw.append("MASTER");
                break;
            case "2023":
                bw.append("0611");
                break;
            case "ALGORITHM":
                bw.append("CONTEST");
                break;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}