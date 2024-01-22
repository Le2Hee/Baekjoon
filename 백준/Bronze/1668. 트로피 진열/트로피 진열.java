import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] trophy = new int[n];
		
		for (int i = 0; i < n; i++) {
			trophy[i] = Integer.parseInt(br.readLine());
		}
		
		int startl = trophy[0];
		int startr = trophy[n - 1];
		int r = 1;
		int l = 1;
		
		for (int i = 0; i < n - 1; i++) {
			if (startl < trophy[i + 1]) {
				l++;
				startl = trophy[i + 1];
			}
		}
		
		for (int i = n - 1; i > 0; i--) {
			if (startr < trophy[i - 1]) {
				r++;
				startr = trophy[i - 1];
			}
		}
		
		sb.append(l).append("\n").append(r);
		System.out.println(sb);
	}
}