import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st; 
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int num;
			
			for (int i = 0; i < n; i++) {
				num = Integer.parseInt(st.nextToken());
				min = Math.min(min, num);
				max = Math.max(max, num);
			}
			
			num = (max - min) * 2;
			sb.append(num).append("\n");
		}
		
		System.out.println(sb);
	}
}