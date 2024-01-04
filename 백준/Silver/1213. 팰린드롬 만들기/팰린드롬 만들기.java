import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] e = new int[26];
		String str = br.readLine();
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			e[((int)str.charAt(i) - 65)]++;
		}
		
		boolean bo = true;
		
		if (len % 2 == 0) {
			for (int i = 0; i < 26; i++) {
				if (e[i] != 0) {
					if (e[i] % 2 == 0) {
						String s = String.valueOf((char)(i + 65));
						for (int j = 0; j < e[i] / 2; j++) {
							sb.append(s);
						}
					} else {
						bo = false;
						break;
					}
				}
			}
			
			if (bo) {
				StringBuffer sub = new StringBuffer(sb);
				sub.reverse();
				sb.append(sub);
			} else {
				sb = new StringBuilder();
				sb.append("I'm Sorry Hansoo");
			}
		} else {
			int index = 0;
			for (int i = 0; i < 26; i++) {
				if (e[i] % 2 == 1) {
					index = i;
					break;
				}
			}
			
			for (int i = 0; i < 26; i++) {
				if (e[i] != 0 && i != index) {
					if (e[i] % 2 == 0 && i != index) {
						char ch = (char)(i + 65);
						for (int j = 0; j < e[i] / 2; j++) {
							sb.append(String.valueOf(ch));
						}
					} else if(i != index) {
						bo = false;
						break;
					}
				} else if (i == index) {
					char ch = (char)(index + 65);
					for (int j = 0; j < e[index] / 2; j++) {
						sb.append(String.valueOf(ch));
					}
				}
			}
			
			if (bo) {
				StringBuffer sub = new StringBuffer(sb);
				sub.reverse();
				char ch = (char)(index + 65);
				sb.append(String.valueOf(ch)).append(sub);
			} else {
				sb = new StringBuilder();
				sb.append("I'm Sorry Hansoo");
			}
			
		}
		
		System.out.println(sb);
	}
}