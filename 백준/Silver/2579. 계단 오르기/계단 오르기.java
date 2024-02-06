import java.io.*;
import java.util.*;

public class Main {
	
	static Integer[] dp;
	static int[] num;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new Integer[n + 1];
		num = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = num[0];
		dp[1] = num[1];
		
		if (n >= 2) {
			dp[2] = num[1] + num[2];
		}
		
		System.out.println(search(n));
	}
	
	private static int search(int n) {
		if (dp[n] == null) {
			dp[n] = Math.max(search(n - 2), search(n - 3) + num[n - 1]) + num[n];
		}
		
		return dp[n];
	}
}
