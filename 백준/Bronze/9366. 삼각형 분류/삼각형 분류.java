import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String str = "";
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			
			if (a == b && b == c) {
				str = "equilateral";
			} else if (a == b && b != c) {
				str = "isosceles";
				if (2 * a <= c) {
					str = "invalid!";
				}
			} else if (a == c && c != b) {
				str = "isosceles";
				if (2 * a <= b) {
					str = "invalid!";
				}
			} else if (b == c && c != a) {
				str = "isosceles";
				if (2 * b <= a) {
					str = "invalid!";
				}
			} else if (a != b && b != c && c != a) {
				str = "scalene";
				if (a > b && a > c) {
					if (b + c <= a) {
						str = "invalid!";
					}
				} else if (b > a && b > c) {
					if (a + c <= b) {
						str = "invalid!";
					}
				} else {
					if (a + b <= c) {
						str = "invalid!";
					}
				}
			}
			
			print(i, str);
		}
		
		System.out.println(sb);
	}
	
	private static void print(int count, String str) {
		sb.append("Case #").append(count).append(": ").append(str).append("\n");
	}
}