import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		int n, min, max;
		StringTokenizer st;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			
			while (n-- > 0) {
				int num = Integer.parseInt(st.nextToken());
				min = Math.min(min, num);
				max = Math.max(max, num);
			}
			
			sb.append(min).append(" ").append(max).append("\n");
		}
		
		System.out.println(sb);
	}
}