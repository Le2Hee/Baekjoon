import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		
		while ((str = br.readLine()) != null) {
			int lcount = 0;
			int ucount = 0;
			int ncount = 0;
			int count = 0;
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if (c == ' ') {
					count++;
				} else if (Character.isDigit(c)) {
					ncount++;
				} else if (Character.isLowerCase(c)) {
					lcount++;
				} else if (Character.isUpperCase(c)) {
					ucount++;
				}
			}
			
			sb.append(lcount).append(" ").append(ucount).append(" ").append(ncount).append(" ").append(count).append("\n");
		}
		
		System.out.println(sb);
    }
}