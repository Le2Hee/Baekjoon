import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		if (n >= m) {
			sb.append("Congratulations, you are within the speed limit!");
		} else {
			int min = m - n;
			
			if (1 <= min && min <= 20) {
				sb.append("You are speeding and your fine is $100.");
			} else if (21 <= min && min <= 30) {
				sb.append("You are speeding and your fine is $270.");
			} else {
				sb.append("You are speeding and your fine is $500.");
			}
		}
		
		System.out.println(sb);
	}
}