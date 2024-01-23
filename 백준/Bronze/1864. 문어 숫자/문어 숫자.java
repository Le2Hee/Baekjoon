import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = "";
		
		while (!(s = br.readLine()).equals("#")) {
			StringBuilder str = new StringBuilder(s);
			str.reverse();
			int sum = 0;
			
			for (int i = 0; i < str.length(); i++) {
				int n = change(str.charAt(i));
				sum += n * Math.pow(8, i);
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int change(char c) {
		if (c == '-') {
			return 0;
		} else if (c == '\\') {
			return 1;
		} else if (c == '(') {
			return 2;
		} else if (c == '@') {
			return 3;
		} else if (c == '?') {
			return 4;
		} else if (c == '>') {
			return 5;
		} else if (c == '&') {
			return 6;
		} else if (c == '%') {
			return 7;
		} else if (c == '/') {
			return -1;
		}
		
		return -2;
	}
}