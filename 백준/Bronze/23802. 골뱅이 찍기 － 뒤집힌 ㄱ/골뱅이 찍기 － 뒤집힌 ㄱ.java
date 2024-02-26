import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		
		f();
		s();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void f() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * 5; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
	}
	
	private static void s() {
		for (int i = 0; i < n * 4; i++) {
			for (int j = 0; j < n; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
	}
}