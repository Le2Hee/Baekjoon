import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] numbers = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		int maxcount = 1;
		int mincount = 1;
		
		for (int i = 0; i < n - 1; i++) {
			if (numbers[i] <= numbers[i + 1]) {
				maxcount++;
			} else {
				max = Math.max(max, maxcount);
				maxcount = 1;
			}
			
			if (numbers[i] >= numbers[i + 1]) {
				mincount++;
			} else {
				max = Math.max(mincount, max);
				mincount = 1;
			}
		}
		
		max = Math.max(max, mincount);
		max = Math.max(max, maxcount);
		
		
		System.out.println(max);
	}
}