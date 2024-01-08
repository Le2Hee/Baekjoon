import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (i > 0) {
				numbers[i] = numbers[i - 1] + num;
			} else {
				numbers[i] = num;
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		int sum;
		while (m-- > 0) {
			sum = 0;
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()) - 2;
			int end = Integer.parseInt(st.nextToken()) - 1;
			
			if (start == -1) {
				sum = numbers[end];
			} else {
				sum = numbers[end] - numbers[start];
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
}