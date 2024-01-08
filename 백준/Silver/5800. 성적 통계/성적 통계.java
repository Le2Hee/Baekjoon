import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int[] numbers = new int[num];
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int gap = Integer.MIN_VALUE;
			
			for (int j = 0; j < num; j++) {
				numbers[j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, numbers[j]);
				min = Math.min(min, numbers[j]);
			}
			
			Arrays.sort(numbers);
			for (int j = num - 1; j > 0; j--) {
				int number = numbers[j] - numbers[j - 1];
				gap = Math.max(gap, number);
			}
			
			toString(i, max, min, gap);
		}
		
		System.out.println(sb);
	}
	
	private static void toString(int n, int maxNum, int minNum, int gap) {
		sb.append("Class ").append(n).append("\n").append("Max ").append(maxNum).append(", Min ").append(minNum).append(", Largest gap ").append(gap).append("\n");
	}
}