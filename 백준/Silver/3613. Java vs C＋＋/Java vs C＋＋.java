import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, "_");
		
		if (str.charAt(0) == '_' || str.charAt(str.length() - 1) == '_' || !check(str) || !continuous(str) || !firstUpper(str)) {
			sb.append("Error!");
		} else {
			if (st.countTokens() != 1) {
				sb.append(st.nextToken());
				
				while (st.hasMoreElements()) {
					StringBuffer s = new StringBuffer(st.nextToken());
					s.replace(0, 1, String.valueOf((char)(s.charAt(0) - 32)));
					sb.append(s);
				}
			} else {
				for (int i = 0; i < str.length(); i++) {
					if (Character.isUpperCase(str.charAt(i))) {
						sb.append("_").append((char)(str.charAt(i) + 32));
					} else {
						sb.append(str.charAt(i));
					}
				}
			}
		}
		
		System.out.println(sb);
	}
	
	private static boolean check(String s) {
		boolean bo = true;
		int bc = 0;
		int uc = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '_') {
				bc = 1;
			} else if (s.charAt(i) < 97) {
				uc = 1;
			}
		}
		
		if (bc == 1 && uc == 1) {
			bo = !bo;
		}
		
		return bo;
	}
	
	private static boolean continuous(String s) {
		boolean bo = true;
		
		StringTokenizer st = new StringTokenizer(s, "_", true);
		int count = 0;
		
		while (st.hasMoreElements()) {
			String str = st.nextToken();
			if (str.equals("_")) {
				count++;
				if (count > 1) {
					bo = !bo;
					break;
				}
			} else {
				count = 0;
			}
		}
		
		return bo;
	}
	
	private static boolean firstUpper(String s) {
		boolean bo = true;
		
		if (Character.isUpperCase(s.charAt(0))) {
			for (int i = 1; i < s.length(); i++) {
				if (Character.isAlphabetic(s.charAt(i))) {
					bo = !bo;
					break;
				}
			}
		}
		
		return bo;
	}
}