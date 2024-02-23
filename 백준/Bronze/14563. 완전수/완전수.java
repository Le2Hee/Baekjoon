import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (t-- > 0) {
			int n = Integer.parseInt(st.nextToken());
			sb.append(func(n));
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static String func(int n) {
		int sum = 0;
		
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		
		if (sum < n) {
			return "Deficient\n";
		} else if (sum == n) {
			return "Perfect\n";
		} else {
			return "Abundant\n";
		}
	}
}