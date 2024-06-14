import java.io.*;
import java.util.*;

public class Main {
	
	static int[] box, dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 박스의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		box = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			box[i] = Integer.parseInt(st.nextToken());
		}
		
		dp = new int[n + 1];
		dp[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			dp[i] = find(i) + 1;
		}
		
		int count = 0;
		for (int m : dp) {
			count = Math.max(count, m);
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int find(int num) {
		int max = 0;
		for (int i = num - 1; i > 0; i--) {
			if (box[i] < box[num]) {
				max = Math.max(max, dp[i]);
			}
		}
		
		return max;
	}
}
