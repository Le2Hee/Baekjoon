import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder s;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ", true);
			s = new StringBuilder();
			String a = st.nextToken();
			String b = st.nextToken();
			String c = st.nextToken();
			String d = st.nextToken();
			
			while (st.hasMoreElements()) {
				s.append(st.nextToken());
			}
			
			s.append(d).append(a).append(b).append(c);
			sb.append(s).append("\n");
		}
		
		System.out.println(sb);
	}
}