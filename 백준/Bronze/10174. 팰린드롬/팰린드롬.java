import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringBuilder s;
		String str;
		
		while (t-- > 0) {
			str = br.readLine();
			
			if (!Character.isDigit(str.charAt(0))) {
				str = str.toLowerCase();
			}
			
			s = new StringBuilder(str);
			s.reverse();
			
			if (str.equals(s.toString())) {
				sb.append("Yes\n");
			} else {
				sb.append("No\n");
			}
		}
		
		System.out.println(sb);
	}
}
