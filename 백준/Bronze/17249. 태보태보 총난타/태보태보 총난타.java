import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), "0");
		String r = st.nextToken();
		String l = st.nextToken();
		
		int rc = 0;
		int lc = 0;
		
		for (int i = 0; i < r.length(); i++) {
			if (r.charAt(i) == '@') {
				rc++;
			}
		}
		
		for (int i = 0; i < l.length(); i++) {
			if (l.charAt(i) == '@') {
				lc++;
			}
		}
		
		sb.append(rc).append(" ").append(lc);
		System.out.println(sb);
	}
}