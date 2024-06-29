package step01_by_level.lv01_io_and_arithmetics.p01_2557;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("Hello World!");
		
		bw.close();
	}
}
