import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		String s;
		StringBuilder a, b, base;
		while (n-- > 0) {
			s = br.readLine();
			a = new StringBuilder();
			b = new StringBuilder();
			
			if (s.length() % 2 == 0) {
				for (int i = 1; i <= s.length(); i++) {
					if (i % 2 == 1) {
						a.append(s.charAt(i - 1));
					} else {
						b.append(s.charAt(i - 1));
					}
				}
			} else {
				base = new StringBuilder();
				base.append(s).append(s);
				
				for (int i = 1; i <= base.length(); i++) {
					if (i % 2 == 1) {
						a.append(base.charAt(i - 1));
					} else {
						b.append(base.charAt(i - 1));
					}
				}
			}
			
			if (b.length() == 0) {
				b.append(a.toString());
			}
			
			sb.append(a.toString()).append("\n").append(b.toString()).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}