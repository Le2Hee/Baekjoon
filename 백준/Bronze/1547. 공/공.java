import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean[] c = new boolean[4];
		int n = Integer.parseInt(br.readLine());
		c[1] = true;
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			if (c[start] || c[end]) {
				c[start] = !c[start];
				c[end] = !c[end];
			}
		}
		
		for (int i = 1; i <= 3; i++) {
			if (c[i]) {
				sb.append(i);
				break;
			}
		}
		
		System.out.println(sb);
	}
}