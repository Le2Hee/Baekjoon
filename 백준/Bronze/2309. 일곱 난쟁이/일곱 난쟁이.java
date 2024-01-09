import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] numbers = new int[9];
		int sum = 0;
		
		for (int i = 0; i < 9; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			sum += numbers[i];
		}
		
		Arrays.sort(numbers);
		int o = 0;
		int t = 0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - (numbers[i] + numbers[j]) == 100) {
					o = i;
					t = j;
					break;
				}
			}
		}
		
		for (int i = 0; i < 9; i++) {
			if (i != o && i != t) {
				sb.append(numbers[i]).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}