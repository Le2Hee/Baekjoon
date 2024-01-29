import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		String s;
		
		for (int i = 1; i <= t; i++) {
			sb.append("String #").append(i).append("\n");
			s = br.readLine();
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'Z') {
					sb.append("A");
				} else {
					char c = (char)(s.charAt(j) + 1);
					sb.append(c);
				}
			}
			
			sb.append("\n\n");
		}
		
		System.out.println(sb);
	}
}
