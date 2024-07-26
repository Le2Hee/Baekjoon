import java.io.*;
import java.util.*;

public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 줄의 개수
		
		int[][] grid = new int[n][3];
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 3; j++) {
				grid[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][][] dp = new int[n][3][2];
		for (int i = 0; i < 3; i++) {
			dp[0][i][0] = grid[0][i];
			dp[0][i][1] = grid[0][i];
		}
		
		for (int i = 1; i < n; i++) {
			dp[i][0][0] = Math.max(dp[i - 1][0][0], dp[i - 1][1][0]) + grid[i][0];
			dp[i][1][0] = Math.max(dp[i - 1][0][0], Math.max(dp[i - 1][1][0], dp[i - 1][2][0])) + grid[i][1];
			dp[i][2][0] = Math.max(dp[i - 1][1][0], dp[i - 1][2][0]) + grid[i][2];
			
			dp[i][0][1] = Math.min(dp[i - 1][0][1], dp[i - 1][1][1]) + grid[i][0];
			dp[i][1][1] = Math.min(dp[i - 1][0][1], Math.min(dp[i - 1][1][1], dp[i - 1][2][1])) + grid[i][1];
			dp[i][2][1] = Math.min(dp[i - 1][1][1], dp[i - 1][2][1]) + grid[i][2];
		}
		
		int max = 0;
		int min = 1000000;
		for (int j = 0; j < 3; j++) {
			max = Math.max(max, dp[n - 1][j][0]);
			min = Math.min(min, dp[n - 1][j][1]);
		}
		
		sb.append(max).append(" ").append(min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}