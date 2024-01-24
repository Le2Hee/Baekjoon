import java.io.*;
import java.util.*;

public class Main {
	
	static long n, k, sum, re, c;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		StringTokenizer st;
		
		while ((str = br.readLine()) != null) {
			sum = 0;
			re = 0;
			c = 0;
			st = new StringTokenizer(str);
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			sum += n;
			c += n;
			coupon();
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void coupon() {
		sum += c / k;
		c = c % k + c / k;
		if (c >= k) {
			coupon();
		}
	}
}