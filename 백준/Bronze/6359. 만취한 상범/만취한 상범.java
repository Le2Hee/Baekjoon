import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			int m = Integer.parseInt(br.readLine());
			
			boolean[] prison = new boolean[m + 1];
			
			for (int i = 1; i <= m; i++) {
				for (int j = i; j <= m; j += i) {
					prison[j] = !prison[j];
				}
			}
			
			int count = 0;
			
			for (boolean bo : prison) {
				if (bo) {
					count++;
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}
}