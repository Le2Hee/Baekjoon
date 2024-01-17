import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] time = new int[101];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		int n = 3;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			for (int i = start; i < end; i++) {
				time[i]++;
			}
			
			min = Math.min(min, start);
			max = Math.max(max, end);
		}
		
		for (int i = min; i <= max; i++) {
			if (time[i] == 1) {
				sum += a;
			} else if (time[i] == 2) {
				sum += b * 2;
			} else if (time[i] == 3) {
				sum += c * 3;
			}
		}
		
		sb.append(sum);
		System.out.println(sb);
	}
}