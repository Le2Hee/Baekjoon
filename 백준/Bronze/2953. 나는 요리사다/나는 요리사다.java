import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		int index = 0;
		int max = 0;
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			
			while (st.hasMoreElements()) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			max = Math.max(max, sum);
			if (max == sum) {
				index = i;
			}
		}
		
		sb.append(index).append(" ").append(max);
		System.out.println(sb);
	}
}