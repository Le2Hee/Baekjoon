import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean[] numbers = new boolean[10001];
		
		for (int i = 1; i <= 10000; i++) {
			String str = String.valueOf(i);
			
			int num = self(str);
			if (num <= 10000) {
				numbers[num] = true;
			}
		}
		
		for (int i = 1; i <= 10000; i++) {
			if (!numbers[i]) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	private static int self(String str) {
		int num = Integer.parseInt(str);
		int result = num;
		
		for (int i = 0; i < str.length(); i++) {
			int number = str.charAt(i) - 48;
			result += number;
		}
		
		return result;
	}
}