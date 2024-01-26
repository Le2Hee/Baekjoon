import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = "";
		
		while (!(s = br.readLine()).equals("0")) {
			sb.append(root(s)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int root(String s) {
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		
		if (sum >= 10) {
			sum = root(String.valueOf(sum));
		}
		
		return sum;
	}
}