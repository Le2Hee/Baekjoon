import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numbers = new int[n];
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = numbers[0];
		int end = 0;
		
		for (int i = 1; i < n; i++) {
			if (numbers[i - 1] < numbers[i]) {
				end = numbers[i];
			} else {
				if (end != 0) {
					max = Math.max(max, end - start);
				}
				start = numbers[i];
				end = 0;
			}
		}
		
		if (end != 0) {
			max = Math.max(max, end - start);
		}
		
		sb.append(max);
		System.out.println(sb);
	}
}