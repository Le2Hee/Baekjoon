import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		char[][] map = new char[n][n];
		String str;
		int wcount = 0;
		int hcount = 0;
		
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < n; i++) {
			int wc = 0;
			int hc = 0;
			for (int j = 0; j < n; j++) {
				if (map[i][j] == '.') {
					wc++;
					
					if (wc == 2) {
						wcount++;
					}
				} else {
					wc = 0;
				}
				
				if (map[j][i] == '.') {
					hc++;
					
					if (hc == 2) {
						hcount++;
					}
				} else {
					hc = 0;
				}
			}
		}
		
		sb.append(wcount).append(" ").append(hcount);
		System.out.println(sb);
	}
}