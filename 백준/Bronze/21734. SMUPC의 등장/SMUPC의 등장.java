import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		char[] arr = br.readLine().toCharArray();
		
		int num;
		for (int i = 0; i < arr.length; i++) {
			num = func(arr[i]);
			
			for (int j = 0; j < num; j++) {
				sb.append((char)arr[i]);
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int func(int n) {
		String s = String.valueOf(n);
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		
		return sum;
	}
}