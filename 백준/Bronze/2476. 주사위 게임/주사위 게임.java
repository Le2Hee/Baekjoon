import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] count;
		int sum;
		StringTokenizer st;
		int result = 0;
		
		while (n-- > 0) {
			count = new int[7];
			sum = 0;
			st = new StringTokenizer(br.readLine());
			count[Integer.parseInt(st.nextToken())]++;
			count[Integer.parseInt(st.nextToken())]++;
			count[Integer.parseInt(st.nextToken())]++;
			int max = -1;
			
			for (int i = 1; i < 7; i++) {
				if (count[i] == 3) {
					sum += 10000 + (i * 1000);
					break;
				} else if (count[i] == 2) {
					sum += 1000 + (i * 100);
					break;
				} else if (count[i] == 1) {
					max = Math.max(max, i);
				}
				
				if (i == 6) {
					sum += max * 100;
				}
			}
			
			result = Math.max(result, sum);
		}
		
		sb.append(result);
		System.out.println(sb);
	}
}