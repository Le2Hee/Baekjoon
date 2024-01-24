import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] stick = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum = 0;
		
		for (int i = 0; i < n; i++) {
			stick[i] = Integer.parseInt(st.nextToken());
			sum += 2 + (stick[i] * 2);
		}
		
		for (int i = 0; i < n - 1; i++) {
			int num = Math.abs(stick[i + 1] - stick[i]);
			if (num > 0) {
				sum += num;
			}
		}
		
		sum += stick[0];
		sum += stick[n - 1];
		
		System.out.println(sum);
	}
}