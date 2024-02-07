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
			double w = Double.parseDouble(st.nextToken());
			String u = st.nextToken();
			
			if (u.charAt(0) == 'k') {
				w *= 2.2046;
				u = "lb";
			} else if (u.charAt(0) == 'g') {
				w *= 3.7854;
				u = "l";
			} else if (u.equals("lb")) {
				w *= 0.4536;
				u = "kg";
			} else {
				w *= 0.2642;
				u = "g";
			}
			
			String result = String.format("%.4f", w);
			sb.append(result).append(" ").append(u).append("\n");
		}
		
		System.out.println(sb);
	}
}