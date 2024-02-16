import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		while (!(s = br.readLine()).equals("#")) {
			char[] arr = s.toCharArray();
			boolean[] check = new boolean[26];
			
			for (int i = 0; i < arr.length; i++) {
				if (Character.isUpperCase(arr[i])) {
					check[arr[i] - 'A'] = true;
				} else if (Character.isLowerCase(arr[i])) {
					check[arr[i] - 'a'] = true;
				}
			}
			
			int count = 0;
			
			for (boolean b : check) {
				if (b) {
					count++;
				}
			}
			
			sb.append(count).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}