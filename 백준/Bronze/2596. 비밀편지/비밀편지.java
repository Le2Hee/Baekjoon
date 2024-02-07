import java.io.*;
import java.util.*;

public class Main {
	
	static String[] val = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
	static char[] key = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		for (int i = 0; i < n * 6; i += 6) {
			String str = s.substring(i, i + 6);
			char c = format(str);
			
			if (c == 'X') {
				sb = new StringBuilder();
				sb.append((i / 6) + 1);
				break;
			} else {
				sb.append(c);
			}
		}
		
		System.out.println(sb);
	}
	
	private static char format(String s) {
		for (int i = 0; i < 8; i++) {
			if (val[i].equals(s)) {
				return key[i];
			}
		}
		
		for (int i = 0; i < 8; i++) {
			String v = val[i];
			int count = 0;
			
			for (int j = 0; j < v.length(); j++) {
				if (v.charAt(j) != s.charAt(j)) {
					count++;
					if (count > 1) {
						break;
					}
				}
			}
			
			if (count == 1) {
				return key[i];
			}
		}
		
		return 'X';
	}
}