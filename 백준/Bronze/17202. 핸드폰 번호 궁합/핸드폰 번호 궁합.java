import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String a = br.readLine();
		String b = br.readLine();
		
		for (int i = 0; i < 8; i++) {
			sb.append(a.charAt(i)).append(b.charAt(i));
		}
		
		while (sb.length() > 2) {
			StringBuilder sub = new StringBuilder();
			
			for (int i = 0; i < sb.length() - 1; i++) {
				int n = sb.charAt(i) - '0';
				int m = sb.charAt(i + 1) - '0';
				int num = (n + m) % 10;
				sub.append(num);
			}
			
			sb = new StringBuilder(sub);
		}
		
		System.out.println(sb);
	}
}