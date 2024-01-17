import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			String n = Integer.toBinaryString(str.charAt(i) - '0');
			
			if (n.length() == 2 && i != 0) {
				sb.append("0").append(n);
			} else if (n.length() == 1 && i != 0) {
				sb.append("00").append(n);
			} else {
				sb.append(n);
			}
		}
		
		System.out.println(sb);
	}
}