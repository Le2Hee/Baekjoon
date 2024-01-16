import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder result = new StringBuilder();
		StringBuffer sbf;
		
		for (int i = 97; i < 117; i++) {
			sb.append((char) i);
		}
		
		int n = 10;
		StringTokenizer st;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken());
			sbf = new StringBuffer();
			sbf.append(sb.substring(start, end));
			sbf.reverse();
			sb.replace(start, end, sbf.toString());
		}
		
		for (int i = 0; i < 20; i++) {
			result.append(((int) sb.charAt(i)) - 96).append(" ");
		}
		
		System.out.println(result);
	}
}