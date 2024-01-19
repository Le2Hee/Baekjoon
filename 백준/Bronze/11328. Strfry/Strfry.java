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
			String a = st.nextToken();
			String b = st.nextToken();
			
			char[] ch = new char[27];
			
			for (int i = 0; i < a.length(); i++) {
				ch[a.charAt(i) - 'a']++;
			}
			
			for (int i = 0; i < b.length(); i++) {
				ch[b.charAt(i) - 'a']--;
			}
			
			boolean bo = true;
			
			for (int i = 0; i < 27; i++) {
				if (ch[i] != 0) {
					bo = !bo;
					break;
				}
			}
			
			if (bo) {
				sb.append("Possible").append("\n");
			} else {
				sb.append("Impossible").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}