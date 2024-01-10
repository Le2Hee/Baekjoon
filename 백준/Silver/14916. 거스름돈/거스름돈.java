import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int f = n / 5;
		int count = Integer.MAX_VALUE;
		
		if (n % 5 == 0) {
			sb.append(f);
		} else {
			boolean bo = false;
			
			for (int i = 0; i <= f; i++) {
				int num = n - (5 * i);
				if (num % 2 == 0) {
					count = Math.min(count, num / 2 + i);
					bo = true;
				}
			}
			
			if (bo) {
				sb.append(count);
			} else {
				sb.append(-1);
			}
		}
		
		System.out.println(sb);
	}
}