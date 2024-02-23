import java.io.*;
import java.util.*;

public class Main {
	
	static int[] pi;
	static String s, str;
	static int result = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		str = br.readLine().replaceAll("[0-9]", "");
		s = br.readLine();
		pi = new int[s.length()];
		
		getPi();
		KMP();
		
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void getPi() {
		int j = 0;
		
		for (int i = 1; i < s.length(); i++) {
			while (j > 0 && s.charAt(i) != s.charAt(j)) {
				j = pi[j - 1];
			}
			
			if (s.charAt(i) == s.charAt(j)) {
				pi[i] = ++j;
			}
			
		}
	}
	
	private static void KMP() {
		int j = 0;
		
		for (int i = 0; i < str.length(); i++) {
			while (j > 0 && str.charAt(i) != s.charAt(j)) {
				j = pi[j - 1];
			}
			
			if (str.charAt(i) == s.charAt(j)) {
				if (j == s.length() - 1) {
					result = 1;
					break;
				} else {
					j++;
				}
			}
		}
	}
}