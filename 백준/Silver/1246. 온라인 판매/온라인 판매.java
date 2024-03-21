import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] price = new int[m];
		for (int i = 0; i < m; i++) {
			price[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int maxsum = 0;
		Arrays.sort(price);
		for (int i = 0; i < m; i++) {
			int rest = m - i;
			if (rest >= n) {
				if (maxsum < n * price[i]) {
					maxsum = n * price[i];
					max = price[i];
				}
			} else {
				if (maxsum < rest * price[i]) {
					maxsum = rest * price[i];
					max = price[i];
				}
			}
		}
		
		sb.append(max).append(" ").append(maxsum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}