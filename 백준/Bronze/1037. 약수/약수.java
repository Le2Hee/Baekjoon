import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		if (n == 1) {
			int num = Integer.parseInt(st.nextToken());
			
			System.out.println(num * num);
		} else {
			int[] numbers = new int[n];
			
			for (int i = 0; i < n; i++) {
				numbers[i] = Integer.parseInt(st.nextToken());
			}
			
			int min = numbers[0];
			int max = numbers[0];
			
			for (int i = 1; i < n; i++) {
				if (min > numbers[i]) {
					min = numbers[i];
				}
				
				if (max < numbers[i]) {
					max = numbers[i];
				}
			}
			
			System.out.println(min * max);
		}
	}
}