import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[] streetlamp = new int[m];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			streetlamp[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0;
		int end = n;
		
		int max = streetlamp[0] - start;
		
		for (int i = 0; i < m - 1; i++) {
			int num = streetlamp[i + 1] - streetlamp[i];
			
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num /= 2;
				num++;
			}
			max = Math.max(max, num);
		}
		
		int last = end - streetlamp[m - 1];
		max = Math.max(max, last);
		
		System.out.println(max);
	}
}