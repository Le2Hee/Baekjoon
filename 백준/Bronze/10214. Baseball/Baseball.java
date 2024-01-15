import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (n-- > 0) {
			int count = 9;
			int y = 0;
			int g = 0;
			
			while (count-- > 0) {
				st = new StringTokenizer(br.readLine());
				y += Integer.parseInt(st.nextToken());
				g += Integer.parseInt(st.nextToken());
				
			}
			
			if (y > g) {
				sb.append("Yonsei");
			} else if (y < g) {
				sb.append("Korea");
			} else {
				sb.append("Draw");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}