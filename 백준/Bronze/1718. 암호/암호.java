import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String plain = br.readLine();
		StringBuilder code = new StringBuilder(br.readLine());
		
		while (code.length() < plain.length()) {
			code.append(code);
		}
		
		for (int i = 0; i < plain.length(); i++) {
			if (plain.charAt(i) != ' ') {
				int a = plain.charAt(i) - 'a';
				int b = code.charAt(i) - 'a';
				
				int n = a - b - 1;
				
				if (n < 0) {
					n += 26;
				}
				
				sb.append((char) (n + 'a'));
			} else {
				sb.append(plain.charAt(i));
			}
		}
		
		System.out.println(sb);
	}
}
