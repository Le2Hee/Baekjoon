import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String a = br.readLine();
		String b = br.readLine();
		int count = 0;
		char[] ach = new char[26];
		char[] bch = new char[26];
		
		for (int i = 0; i < a.length(); i++) {
			ach[a.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < b.length(); i++) {
			bch[b.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (ach[i] != 0 || bch[i] != 0) {
				if (ach[i] != bch[i]) {
					count += Math.abs(ach[i] - bch[i]);
				}
			}
		}
		
		sb.append(count);
		System.out.println(sb);
	}
}