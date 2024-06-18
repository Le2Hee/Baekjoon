import java.io.*;
import java.util.*;

public class Main {
	
	static int m;
	static String str;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()) - 1;
		m = Integer.parseInt(br.readLine());
		str = br.readLine();
		
		StringBuilder sub = new StringBuilder();
		sub.append("IOI");
		
		while (n-- > 0) {
			sub.append("OI");
		}
		
		String s = sub.toString();
		
		int plus = 0;
		int start = 0;
		int end = s.length();
		int count = 0;
		
		while (true) {
			if (str.substring(start, end).equals(s)) {
				count++;
				start += 2;
				end += 2;
			} else {
				plus = find(start);
				
				if (plus == -1) {
					break;
				} else {
					start = plus;
					end = start + s.length();
				}
			}
			
			if (end >= m) {
				break;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int find(int index) {
		for (int i = index + 1; i < m; i++) {
			if (str.charAt(i) == 'I') {
				return i;
			}
		}
		
		return -1;
	}
}