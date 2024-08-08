import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s;
		
		char c;
		int n, index;
		StringBuilder sub;
		StringTokenizer st;
		while (!(s = br.readLine()).equals("0")) {
			n = Integer.parseInt(s);
			sub = new StringBuilder();
			index = 0;
			
			while (n-- > 0) {
				st = new StringTokenizer(br.readLine());
				s = st.nextToken();
				
				switch (s) {
				case "INSERT":
					c = st.nextToken().charAt(0);
					
					if (sub.length() == 0) {
						sub.append(c);
					} else {
						if (sub.length() == index) {
							sub.replace(index - 1, index, sub.substring(index - 1, index) + c);
						} else {
							sub.replace(index, index + 1, c + sub.substring(index, index + 1));
						}
					}
					
					index++;
					break;
				case "LEFT":
					if (index != 0) {
						index--;
					}
					
					break;
				case "RIGHT":
					if (index != sub.length()) {
						index++;
					}
					
					break;
				}
			}
			
			sb.append(sub.toString()).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}