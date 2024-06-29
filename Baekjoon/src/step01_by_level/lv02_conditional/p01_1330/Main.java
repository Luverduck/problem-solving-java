package step01_by_level.lv02_conditional.p01_1330;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(a > b)
			System.out.print(">");
		else if(a < b)
			System.out.print("<");
		else
			System.out.print("==");
	}
}
