import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 10;
		int[] count = new int[1001];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			
			min = Math.min(min, num);
			max = Math.max(max, num);
			sum += num;
			count[num]++;
		}
		
		int val = count[min];
		int index = min;
		for (int i = min + 10; i <= max; i+=10) {
			if (val < count[i]) {
				val = count[i];
				index = i;
			}
		}
		
		sb.append(sum / 10).append("\n").append(index);
		System.out.println(sb);
	}
}