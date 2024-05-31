import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine()); // 정수
		
		for (int i = 0; i < n; i++) {
			one();
		}
		
		for (int i = 0; i < n; i++) {
			two();
		}
		
		for (int i = 0; i < n; i++) {
			three();
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void one() {
		for (int i = 0; i < n; i++) {
			sb.append("G");
		}
		
		for (int i = 0; i < n; i++) {
			sb.append("...");
		}
		
		sb.append("\n");
	}
	
	private static void two() {
		for (int i = 0; i < n; i++) {
			sb.append(".");
		}
		
		for (int i = 0; i < n; i++) {
			sb.append("I");
		}
		
		for (int i = 0; i < n; i++) {
			sb.append(".");
		}
		
		for (int i = 0; i < n; i++) {
			sb.append("T");
		}
		
		sb.append("\n");
	}
	
	private static void three() {
		for (int i = 0; i < n; i++) {
			sb.append("..");
		}
		
		for (int i = 0; i < n; i++) {
			sb.append("S");
		}
		
		for (int i = 0; i < n; i++) {
			sb.append(".");
		}
		
		sb.append("\n");
	}
}