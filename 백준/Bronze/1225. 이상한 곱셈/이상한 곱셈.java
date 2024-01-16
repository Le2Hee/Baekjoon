import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		String m = st.nextToken();
		long sum = 0;
		
		if (!n.equals("0") && !m.equals("0")) {
			for (int i = 0; i < n.length(); i++) {
				int a = Integer.parseInt(String.valueOf(n.charAt(i)));
				if (a == 0) {
					continue;
				}
				for (int j = 0; j < m.length(); j++) {
					int b = Integer.parseInt(String.valueOf(m.charAt(j)));
					if (b == 0) {
						continue;
					}
					sum += a * b;
				}
			}
		}
		
		sb.append(sum);
		System.out.println(sb);
	}
}