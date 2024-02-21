import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[] count;
	static List<Character> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			count = new boolean[26];
			list = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreElements()) {
				char[] str = st.nextToken().toCharArray();
				
				for (int i = 0; i < str.length; i++) {
					if (Character.isLowerCase(str[i])) {
						count[str[i] - 'a'] = true;
					} else if (Character.isUpperCase(str[i])) {
						count[str[i] - 'A'] = true;
					}
				}
			}
			
			check();
			
			if (list.size() == 0) {
				sb.append("pangram");
			} else {
				sb.append("missing ");
				for (char c : list) {
					sb.append(c);
				}
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void check() {
		for (int i = 0; i < 26; i++) {
			if (!count[i]) {
				list.add((char)(i + 'a'));
			}
		}
	}
}