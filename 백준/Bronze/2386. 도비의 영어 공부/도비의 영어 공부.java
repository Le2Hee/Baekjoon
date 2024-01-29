import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = "";
		StringTokenizer st;
		
		while (!(s = br.readLine()).equals("#")) {
			st = new StringTokenizer(s);
			char a = st.nextToken().charAt(0);
			int count = 0;
			
			while (st.hasMoreElements()) {
				String str = st.nextToken().toLowerCase();
				
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == a) {
						count++;
					}
				}
			}
			
			sb.append(a).append(" ").append(count).append("\n");
		}
		
		System.out.println(sb);
	}
}