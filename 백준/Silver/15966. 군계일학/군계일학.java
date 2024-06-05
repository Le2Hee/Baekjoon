import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 수열의 길이
		StringTokenizer st = new StringTokenizer(br.readLine()); // 수열
		
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[1000001]; // 연속된 수열의 개수를 저장하는 배열
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			dp[arr[i]] = Math.max(dp[arr[i]], dp[arr[i] - 1] + 1); // 뒤에 연속된 수열의 개수보다 +1
			count = Math.max(count, dp[arr[i]]);
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}