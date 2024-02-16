import java.io.*;
import java.util.*;

public class Main {
	
	static String[] arr, word;
	static int n, m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		arr = new String[n];
		int index = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
			if (arr[i].equals("?")) {
				index = i;
			}
		}
		
		m = Integer.parseInt(br.readLine());
		word = new String[m];
		
		for (int i = 0; i < m; i++) {
			word[i] = br.readLine();
		}
		
		if (n == 1) {
			sb.append(word[0]);
		} else {
			char start = '0';
			char end = '0';
			
			
			if (index == 0) {
				end = arr[index + 1].charAt(0);
				
				for (int i = 0; i < m; i++) {
					if (word[i].charAt(word[i].length() - 1) == end) {
						if (check(word[i])) {
							sb.append(word[i]);
							break;
						}
					}
				}
			} else if (index == n - 1) {
				start = arr[index - 1].charAt(arr[index - 1].length() - 1);
				
				for (int i = 0; i < m; i++) {
					if (word[i].charAt(0) == start) {
						if (check(word[i])) {
							sb.append(word[i]);
							break;
						}
					}
				}
			} else {
				start = arr[index - 1].charAt(arr[index - 1].length() - 1);
				end = arr[index + 1].charAt(0);
				
				for (int i = 0; i < m; i++) {
					if (word[i].charAt(0) == start && word[i].charAt(word[i].length() - 1) == end) {
						if (check(word[i])) {
							sb.append(word[i]);
							break;
						}
					}
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean check(String s) {
		boolean bo = true;
		
		for (int i = 0; i < n; i++) {
			if (s.equals(arr[i])) {
				bo = false;
			}
		}
		
		return bo;
	}
}