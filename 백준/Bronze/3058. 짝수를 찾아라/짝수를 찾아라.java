import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int min = Integer.MAX_VALUE;
			int sum = 0;
			
			while (st.hasMoreElements()) {
				int n = Integer.parseInt(st.nextToken());
				if (n % 2 == 0) {
					sum += n;
					min = Math.min(min, n);
				}
			}
			
			sb.append(sum).append(" ").append(min).append("\n");
		}
		
		System.out.println(sb);
	}
}