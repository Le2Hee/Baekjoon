import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for (int i = 1; ; i++) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
			
			if (s.equals("E")) {
				break;
			}
			
			sb.append("Case ").append(i).append(": ");
			
			if (s.equals(">")) {
				sb.append(a > b).append("\n");
			} else if (s.equals(">=")) {
				sb.append(a >= b).append("\n");
			} else if (s.equals("<")) {
				sb.append(a < b).append("\n");
			} else if (s.equals("<=")) {
				sb.append(a <= b).append("\n");
			} else if (s.equals("==")) {
				sb.append(a == b).append("\n");
			} else {
				sb.append(a != b).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}