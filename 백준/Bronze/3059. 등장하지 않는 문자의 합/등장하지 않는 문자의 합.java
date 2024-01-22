import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] count;
		int n = Integer.parseInt(br.readLine());
		String str;
		
		while (n-- > 0) {
			count = new int[26];
			str = br.readLine();
			int sum = 0;
			
			for (int i = 0; i < str.length(); i++) {
				count[str.charAt(i) - 'A']++;
			}
			
			for (int i = 0; i < 26; i++) {
				if (count[i] == 0) {
					sum += i + 65;
				}
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
}