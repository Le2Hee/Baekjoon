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
		t();
		s();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void f() {
		for (int i = 0; i < n * 2; i++) {
			for (int j = 0; j < n * 5; j++) {
				if (n <= j && j < n * 4) {
					sb.append(" ");
				} else {
					sb.append("@");
				}
			}
			sb.append("\n");
		}
	}
	
	private static void s() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * 5; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
	}
	
	private static void t() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * 5; j++) {
				if (n <= j && j < n * 4) {
					sb.append(" ");
				} else {
					sb.append("@");
				}
			}
			sb.append("\n");
		}
	}
}