import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		String str;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			double num = Double.parseDouble(st.nextToken());
			
			while (st.hasMoreElements()) {
				str = st.nextToken();
				if (str.equals("@")) {
					num *= 3;
				} else if (str.equals("%")) {
					num += 5;
				} else {
					num -= 7;
				}
			}
			
			str = String.format("%.2f", num);
			sb.append(str).append("\n");
		}
		
		System.out.println(sb);
	}
}