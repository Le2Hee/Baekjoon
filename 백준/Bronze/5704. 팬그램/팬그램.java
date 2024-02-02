import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = "";
		
		while (!(s = br.readLine()).equals("*")) {
			visit = new boolean[26];
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != ' ') {
					visit[s.charAt(i) - 'a'] = true;
				}
			}
			
			if (check()) {
				sb.append("Y");
			} else {
				sb.append("N");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static boolean check() {
		for (boolean b : visit) {
			if (!b) {
				return false;
			}
		}
		return true;
	}
}
