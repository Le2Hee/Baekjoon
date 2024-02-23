import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int head;
		char[] s;
		
		for (int i = 1; i <= t; i++) {
			sb.append("Data Set ").append(i).append(":\n");
			head = Integer.parseInt(br.readLine());
			s = br.readLine().toCharArray();
			
			for (int j = 0; j < s.length; j++) {
				if (s[j] == 'c') {
					head++;
				} else {
					head--;
				}
			}
			
			sb.append(head).append("\n\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}