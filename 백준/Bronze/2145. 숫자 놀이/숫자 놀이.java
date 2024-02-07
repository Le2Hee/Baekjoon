import java.io.*;
import java.util.*;

public class Main {
	
	static int result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		while (!(s = br.readLine()).equals("0")) {
			result = 0;
			search(s);
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void search(String s) {
		int n = Integer.parseInt(s);
		
		if (n < 10) {
			result = n;
			return;
		}
		
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		
		search(String.valueOf(sum));
	}
}