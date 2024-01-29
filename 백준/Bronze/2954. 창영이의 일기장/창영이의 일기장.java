import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			if (check(s.charAt(i)) && (s.charAt(i) == s.charAt(i + 2) && s.charAt(i + 1) == 'p')) {
				sb.append(s.charAt(i));
				i += 2;
			} else {
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println(sb);
	}
	
	private static boolean check(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; 
	}
}
