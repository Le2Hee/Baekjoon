import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		if (check(n)) {
			if (n % 7 == 0) {
				sb.append(3);
			} else {
				sb.append(2);
			}
		} else {
			if (n % 7 == 0) {
				sb.append(1);
			} else {
				sb.append(0);
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean check(int n) {
		char[] arr = String.valueOf(n).toCharArray();
		boolean result = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '7') {
				result = true;
				break;
			}
		}
		
		return result;
	}
}
