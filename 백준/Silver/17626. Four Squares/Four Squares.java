import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			dp[i] = Integer.MAX_VALUE;
			
			for (int j = 1; Math.pow(j, 2) <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
			}
		}
		
		bw.write(Integer.toString(dp[n]));
		bw.flush();
		bw.close();
		br.close();
	}
}