import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		String s = "", result = "";
		int[] count;
		
		while (t-- > 0) {
			count = new int[26];
			result = "";
			s = br.readLine();
			
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				count[c - 'A']++;
				
				if (count[c - 'A'] == 3) {
					if (i == s.length() - 1) {
						result = "FAKE";
						break;
					} 
					
					char sub = s.charAt(i + 1);
					if (sub != c) {
						result = "FAKE";
						break;
					} else {
						i++;
						count[c - 'A'] = 0;
					}
				}
			}
			
			if (result.equals("")) {
				sb.append("OK\n");
			} else {
				sb.append(result).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
