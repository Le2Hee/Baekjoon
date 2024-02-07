import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		sb.append("Gnomes:\n");
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a < b && b < c) {
				sb.append("Ordered\n");
			} else if (a > b && b > c) {
				sb.append("Ordered\n");
			} else {
				sb.append("Unordered\n");
			}
		}
		
		System.out.println(sb);
	}
}