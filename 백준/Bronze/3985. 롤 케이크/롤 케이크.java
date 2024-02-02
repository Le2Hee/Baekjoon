import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int l = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] cake = new int[l + 1];
		int a = 0;
		int b = 0;
		int[] count = new int[n + 1];
		int amax = 0;
		int bmax = 0;
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			if (amax < end - start + 1) {
				amax = end - start + 1;
				a = i;
			}
			
			for (int j = start; j <= end; j++) {
				if (cake[j] == 0) {
					cake[j] = i;
					count[i]++;
					bmax = Math.max(bmax, count[i]);
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if (count[i] == bmax) {
				b = i;
				break;
			}
		}
		
		sb.append(a).append("\n").append(b);
		System.out.println(sb);
	}
}