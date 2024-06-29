package step01_by_level.lv01_io_and_arithmetics.p02_1000;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.setIn(new FileInputStream("fileio/input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		while(st.hasMoreTokens())
			sum += Integer.parseInt(st.nextToken());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(sum));
		bw.flush();
		
		br.close();
		bw.close();
	}
}
