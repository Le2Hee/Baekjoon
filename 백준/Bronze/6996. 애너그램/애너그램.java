import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] count;
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (n-- > 0) {
			count = new int[26];
			st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			
			if (a.length() != b.length()) {
				notprint(a, b);
				continue;
			}
			
			for (int i = 0; i < a.length(); i++) {
				count[a.charAt(i) - 'a']++;
				count[b.charAt(i) - 'a']--;
			}
			
			boolean bo = true;
			
			for (int i = 0; i < a.length(); i++) {
				if (count[i] != 0) {
					bo = !bo;
					break;
				}
			}
			
			if (bo) {
				print(a, b);
			} else {
				notprint(a, b);
			}
		}
		
		System.out.println(sb);
	}
	
	private static void notprint(String a, String b) {
		sb.append(a).append(" & ").append(b).append(" are NOT anagrams.").append("\n");
	}
	
	private static void print(String a, String b) {
		sb.append(a).append(" & ").append(b).append(" are anagrams.").append("\n");
	}
}