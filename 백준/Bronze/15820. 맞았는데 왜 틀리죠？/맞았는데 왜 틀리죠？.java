import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sample = Integer.parseInt(st.nextToken());
		int system = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < sample; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (a != b) {
				sb.append("Wrong Answer");
				break;
			}
		}
		
		if (sb.length() == 0) {
			for (int i = 0; i < system; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				if (a != b) {
					sb.append("Why Wrong!!!");
					break;
				}
			}
		}
		
		if (sb.length() == 0) {
			sb.append("Accepted");
		}
		
		System.out.println(sb);
	}
}
