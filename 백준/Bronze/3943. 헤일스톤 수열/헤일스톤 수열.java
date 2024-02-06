import java.io.*;
import java.util.*;

public class Main {
	
	static int max;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			max = 0;
			halestone(num);
			sb.append(max).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void halestone(int n) {
		max = Math.max(max, n);
		
		if (n == 1) {
			return;
		}
		
		if (n % 2 == 0) {
			halestone(n / 2);
		} else {
			halestone((n * 3) + 1);
		}
	}
}