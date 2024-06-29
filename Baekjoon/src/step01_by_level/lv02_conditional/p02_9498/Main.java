package step01_by_level.lv02_conditional.p02_9498;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//System.setIn(new FileInputStream("fileio/input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int score = Integer.parseInt(st.nextToken());
		
		if(score >= 90)
			System.out.print("A");
		else if(score >= 80)
			System.out.print("B");
		else if(score >= 70)
			System.out.print("C");
		else if(score >= 60)
			System.out.print("D");
		else
			System.out.print("F");
		
		br.close();
	}
}
