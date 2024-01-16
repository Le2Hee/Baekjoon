import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				sb.append("X");
			} else if (str.charAt(i) == 'B') {
				sb.append("Y");
			} else if (str.charAt(i) == 'C') {
				sb.append("Z");
			} else {
				sb.append((char) (str.charAt(i) - 3));
			}
		}
		
		System.out.println(sb);
	}
}