import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ".", true);
		boolean bo = true;
		
		while (st.hasMoreElements()) {
			String str = st.nextToken();
			
			if (!str.equals(".")) {
				if (str.length() % 4 == 0) {
					for (int i = 0; i < str.length(); i++) {
						sb.append("A");
					}
				} else if (str.length() % 4 == 2) {
					int num = str.length() / 4;
					for (int i = 0; i < num; i++) {
						sb.append("AAAA");
					}
					sb.append("BB");
				} else if (str.length() == 2) {
					sb.append("BB");
				} else {
					bo = false;
					break;
				}
			} else {
				sb.append(".");
			}
		}
		
		if (!bo) {
			sb = new StringBuilder("-1");
		}
		
		System.out.println(sb);
	}
}