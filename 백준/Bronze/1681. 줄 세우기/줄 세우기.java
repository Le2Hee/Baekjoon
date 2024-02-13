import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		for (int i = 1; n > 0; i++) {
			String s = String.valueOf(i);
			if (check(s, l)) {
				n--;
				
				if (n == 0) {
					System.out.println(i);
				}
			}
		}
	}
	
	private static boolean check(String s, int n) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) - '0' == n) {
				return false;
			}
		}
		
		return true;
	}
}