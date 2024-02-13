import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			String s = br.readLine();
			
			for (int i = 0; i < s.length(); i++) {
				int e = (a * (s.charAt(i) - 'A') + b) % 26;
				sb.append((char)(e + 'A'));
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}