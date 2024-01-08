import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] numbers = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < n - m + 1; i++) {
			sum = 0;
			
			for (int j = i; j < i + m; j++) {
				sum += numbers[j];
			}
			
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
	}
}