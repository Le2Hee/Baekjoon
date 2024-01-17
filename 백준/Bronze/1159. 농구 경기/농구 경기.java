import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] count = new int[26];
		while (n-- > 0) {
			String s = br.readLine();
			count[s.charAt(0) - 'a']++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (count[i] >= 5) {
				char s = (char)(i + 'a');
				sb.append(s);
			}
		}
		
		if (sb.length() == 0) {
			sb.append("PREDAJA");
		}
		
		System.out.println(sb);
	}
}