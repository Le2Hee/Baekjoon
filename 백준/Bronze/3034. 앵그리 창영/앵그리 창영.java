import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			double max = Math.sqrt((w * w) + (h * h));
			
			if (num <= max) {
				sb.append("DA");
			} else {
				sb.append("NE");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}