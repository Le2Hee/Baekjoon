import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = n; i >= 4; i--) {
			String s = String.valueOf(i);
			boolean bo = true;
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) != '4' && s.charAt(j) != '7') {
					bo = !bo;
					break;
				}
			}
			
			if (bo) {
				sb.append(i);
				break;
			}
		}
		
		System.out.println(sb);
	}
}