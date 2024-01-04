import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "<> ", true);
		int count = 0;
		
		while (st.hasMoreElements()) {
			String str = st.nextToken();
			
			if (str.equals("<")) {
				count++;
				sb.append("<");
			} else if (str.equals(">")) {
				count--;
				sb.append(">");
			} else if (str.equals(" "))  {
				sb.append(" ");
			} else {
				if (count == 0) {
					StringBuffer sbf = new StringBuffer(str);
					sb.append(sbf.reverse());
				} else {
					sb.append(str);
				}
			}
		}
		
		System.out.println(sb);
	}
}