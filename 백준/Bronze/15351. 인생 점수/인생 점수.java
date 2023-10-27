import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// A -> 65
		int n = Integer.parseInt(br.readLine());
		String str = null;
		
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			int count = 0;			
			
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != ' ') {
					char ch = str.charAt(j);
					
					count += (int)ch - 64;
				}
			}
			
			if (count == 100) {
				sb.append("PERFECT LIFE").append("\n");
			} else {
				sb.append(count).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}