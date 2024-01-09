import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] numbers = new long[n];
		long[] sums = new long[n];
		long sum = 0;
		numbers[0] = Integer.parseInt(st.nextToken());
		sums[0] = numbers[0];
		
		for (int i = 1; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
			sums[i] = numbers[i] + sums[i - 1];
		}
		
		for (int i = 1; i < n; i++) {
			sum += numbers[i] * sums[i - 1];
		}
		
		System.out.println(sum);
	}
}