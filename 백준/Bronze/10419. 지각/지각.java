import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		int n = 0;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			int max = 0;
			
			for (int i = 0; i < n; i++) {
				if (i * (i + 1) <= n) {
					max = Math.max(max, i);
				} else {
					break;
				}
			}
			
			sb.append(max).append("\n");
		}
		
		System.out.println(sb);
	}
}