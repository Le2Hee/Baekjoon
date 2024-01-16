import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringBuffer str;
		
		
		for (int i = 1; i <= n; i++) {
			str = new StringBuffer(br.readLine());
			char c = str.charAt(0);
			if (c >= 97) {
				c -= 32;
			}
			str.replace(0, 1, String.valueOf(c));
			sb.append(str.toString()).append("\n");
		}
		
		System.out.println(sb);
	}
}