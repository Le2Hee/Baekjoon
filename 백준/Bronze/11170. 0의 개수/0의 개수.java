import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int count = 0;
			
			for (int i = start; i <= end; i++) {
				String s = String.valueOf(i);
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == '0') {
						count++;
					}
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}
}