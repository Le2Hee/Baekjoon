import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String s = "";
		StringBuilder a, b;
		int count;
		
		while (!(s = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(s);
			a = new StringBuilder(st.nextToken());
			b = new StringBuilder(st.nextToken());
			
			a.reverse();
			b.reverse();
			
			int minIndex = Math.min(a.length(), b.length());
			boolean check = false;
			count = 0;
			
			for (int i = 0; i < minIndex; i++) {
				int n = a.charAt(i) - '0';
				int m = b.charAt(i) - '0';
				int sum = check ? n + m + 1 : n + m;
				
				if (sum >= 10) {
					count++;
					check = true;
				} else {
					check = false;
				}
			}
			
			if (check) {
				if (a.length() == minIndex) {
					for (int i = minIndex; i < b.length(); i++) {
						if (b.charAt(i) == '9') {
							count++;
						} else {
							break;
						}
					}
				} else {
					for (int i = minIndex; i < a.length(); i++) {
						if (a.charAt(i) == '9') {
							count++;
						} else {
							break;
						}
					}
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