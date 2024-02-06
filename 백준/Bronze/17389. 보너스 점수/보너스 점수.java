import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int bonus = 0;
		int sum = 0;
		String s = br.readLine();
		
		for (int i = 1; i <= n; i++) {
			char c = s.charAt(i - 1);
			
			if (c == 'O') {
				sum += i + bonus;
				bonus++;
			} else {
				bonus = 0;
			}
		}
		
		System.out.println(sum);
	}
}