import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder a = new StringBuilder(st.nextToken());
		StringBuilder b = new StringBuilder(st.nextToken());
		
		Stack<Integer> stack = new Stack<>();
		a.reverse();
		b.reverse();
		
		int len = Math.min(a.length(), b.length());
		
		for (int i = 0; i < len; i++) {
			int n = a.charAt(i) - '0';
			int m = b.charAt(i) - '0';
			stack.add(n + m);
		}
		
		for (int i = len; i < a.length(); i++) {
			stack.add(a.charAt(i) - '0');
		}
		
		for (int i = len; i < b.length(); i++) {
			stack.add(b.charAt(i) - '0');
		}
		
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
	}
}