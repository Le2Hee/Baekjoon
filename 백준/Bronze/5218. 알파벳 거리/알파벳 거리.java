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
			String start = st.nextToken();
			String end = st.nextToken();
			
			sb.append("Distances: ");
			
			for (int i = 0; i < start.length(); i++) {
				int num = end.charAt(i) - start.charAt(i);
				if (num < 0) {
					num += 26;
				}
				
				sb.append(num).append(" ");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}