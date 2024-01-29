import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String s;
		int n;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine(), "-");
			s = st.nextToken();
			n = Integer.parseInt(st.nextToken());
			int sum = ((s.charAt(0) - 'A') * 26 * 26) + ((s.charAt(1) - 'A') * 26) + s.charAt(2) - 'A';
			
			if (Math.abs(sum - n) <= 100) {
				sb.append("nice").append("\n");
			} else {
				sb.append("not nice").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}