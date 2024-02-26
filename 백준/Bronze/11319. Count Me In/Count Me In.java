import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		String s = "";
		int c1, c2;
		while (t-- > 0) {
			s = br.readLine();
			c1 = 0;
			c2 = 0;
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != ' ') {
					if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
						c1++;
					} else {
						c2++;
					}
				}
			}
			
			sb.append(c2).append(" ").append(c1).append("\n"); 
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
