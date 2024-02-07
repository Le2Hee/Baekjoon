import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			char c = st.nextToken().charAt(0);
			long b = Long.parseLong(st.nextToken());
			String s = st.nextToken();
			long d = Long.parseLong(st.nextToken());
			
			if (c == '+') {
				if (a + b == d) {
					sb.append("correct\n");
				} else {
					sb.append("wrong answer\n");
				}
			} else if (c == '-') {
				if (a - b == d) {
					sb.append("correct\n");
				} else {
					sb.append("wrong answer\n");
				}
			} else if (c == '*') {
				if (a * b == d) {
					sb.append("correct\n");
				} else {
					sb.append("wrong answer\n");
				}
			} else {
				if (a / b == d) {
					sb.append("correct\n");
				} else {
					sb.append("wrong answer\n");
				}
			}
		}
		
		System.out.println(sb);
	}
}