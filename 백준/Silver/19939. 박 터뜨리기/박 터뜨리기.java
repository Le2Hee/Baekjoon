import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] count = new int[k];
		int sum = 0;
		for (int i = 0; i < k; i++) {
			count[i] = i + 1;
			sum += i + 1;
		}
		
		if (sum > n) {
			sb.append(-1);
		} else if (sum == n) {
			sb.append(count[k - 1] - count[0]);
		} else {
			int num = (n - sum) % k;
			
			if (num == 0) {
				sb.append(count[k - 1] - count[0]);
			} else {
				sb.append(count[k - 1] - count[0] + 1);
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}