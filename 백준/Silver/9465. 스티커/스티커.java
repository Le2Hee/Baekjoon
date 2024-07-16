import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		int n;
		int[][] sticker, dp;
		StringTokenizer st;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine()); // 한 줄의 스티커 개수
			
			sticker = new int[2][n + 1];
			for (int i = 0; i < 2; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= n; j++) {
					sticker[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			dp = new int[2][n + 1];
			dp[0][1] = sticker[0][1];
			dp[1][1] = sticker[1][1];
			
			for (int i = 2; i <= n; i++) {
				dp[0][i] = Math.max(dp[1][i - 2], dp[1][i - 1]) + sticker[0][i];
				dp[1][i] = Math.max(dp[0][i - 2], dp[0][i - 1]) + sticker[1][i];
			}
			
			sb.append(dp[0][n] > dp[1][n] ? dp[0][n] : dp[1][n]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}