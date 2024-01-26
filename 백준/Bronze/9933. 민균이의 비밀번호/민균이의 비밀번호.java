import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[] id = new String[n];
		
		for (int i = 0; i < n; i++) {
			id[i] = br.readLine();
		}
		
		StringBuilder str;
		
		for (int i = 0; i < n; i++) {
			str = new StringBuilder(id[i]).reverse();
			for (int j = 0; j < n; j++) {
				if (str.toString().equals(id[j])) {
					sb.append(str.length()).append(" ").append(str.charAt(str.length() / 2));
					break;
				}
			}
			
			if (sb.length() != 0) {
				break;
			}
		}
		
		System.out.println(sb);
	}
}