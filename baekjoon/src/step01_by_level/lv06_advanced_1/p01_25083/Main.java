package baekjoon.src.step01_by_level.lv06_advanced_1.p01_25083;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String result = "         ,r'\"7\n" +
                "r`-_   ,'  ,/\n" +
                " \\. \". L_r'\n" +
                "   `~\\/\n" +
                "      |\n" +
                "      |";

        bw.append(result);

        bw.flush();
        bw.close();
    }
}
