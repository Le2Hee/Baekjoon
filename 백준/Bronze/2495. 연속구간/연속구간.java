import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 3;
		
		while (n-- > 0) {
			String str = br.readLine();
			int count = 1;
			char c = str.charAt(0);
			int max = 0;
			
			for (int i = 1; i < str.length(); i++) {
				if (c == str.charAt(i)) {
					count++;
				} else {
					max = Math.max(max, count);
					count = 1;
					c = str.charAt(i);
				}
			}
			
			max = Math.max(max, count);
			sb.append(max).append("\n");
		}
		
		System.out.println(sb);
	}
}