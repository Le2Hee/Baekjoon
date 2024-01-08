import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		int[] numbers = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		long sum;
		long count = 0;
		
		for (int i = 0; i < n; i++) {
			sum = numbers[i];
			
			if (sum == m) {
				count++;
				continue;
			}
			
			for (int j = i + 1; j < n; j++) {
				sum += numbers[j];
				if (sum == m) {
					count++;
				} else if (sum > m) {
					break;
				}
			}
		}
		
		System.out.println(count);
	}
}