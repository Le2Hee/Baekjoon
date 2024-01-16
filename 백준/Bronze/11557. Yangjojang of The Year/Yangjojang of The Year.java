import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		int n, price, max;
		StringTokenizer st;
		String name, result;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			max = Integer.MIN_VALUE;
			result = "";
			
			while (n-- > 0) {
				st = new StringTokenizer(br.readLine());
				name = st.nextToken();
				price = Integer.parseInt(st.nextToken());
				max = Math.max(price, max);
				if (max == price) {
					result = name;
				}
			}
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}
}