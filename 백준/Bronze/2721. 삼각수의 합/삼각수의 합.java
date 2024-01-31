import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int num;
		
		while (n-- > 0) {
			num = Integer.parseInt(br.readLine());
			sb.append(W(num)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int W(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += (i * T(i + 1));
		}
		
		return sum;
	}
	
	private static int T(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
}
