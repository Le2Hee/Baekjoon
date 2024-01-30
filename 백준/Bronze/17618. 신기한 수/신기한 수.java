import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0, sum;
		String s = "";
		
		for (int i = 1; i <= n; i++) {
			s = String.valueOf(i);
			sum = 0;
			
			for (int j = 0; j < s.length(); j++) {
				sum += s.charAt(j) - '0';
			}
			
			if (i % sum == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}