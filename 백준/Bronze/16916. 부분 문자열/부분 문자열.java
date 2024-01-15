import java.io.*;
import java.util.*;

public class Main {
	
	static int[] pi;
	static String s, p;
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		s = br.readLine();
		p = br.readLine();
		pi = new int[p.length()];
		pitable();
		kmp();
		System.out.println(count);
	}
	
	private static void pitable() {
		int j = 0;
		
		for (int i = 1; i < p.length(); i++) {
			while (j > 0 && p.charAt(i) != p.charAt(j)) {
				j = pi[j -1];
			}
			
			if (p.charAt(i) == p.charAt(j)) {
				pi[i] = ++j;
			}
		}
	}
	
	private static void kmp() {
		int j = 0;
		for (int i = 0; i <s.length(); i++) {
			
			while (j > 0 && s.charAt(i) != p.charAt(j)) {
				j = pi[j - 1];
			}
			
			if (s.charAt(i) == p.charAt(j)) {
				if (j == p.length() - 1) {
					count = 1;
					break;
				} else {
					++j;
				}
			}
		}
	}
}