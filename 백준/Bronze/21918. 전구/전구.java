import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		boolean[] bulb = new boolean[n + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			int m = Integer.parseInt(st.nextToken());
			
			if (m == 1) {
				bulb[i] = true;
			}
		}
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			switch (command) {
			case 1:
				if (x == 1) {
					bulb[num] = true;
				} else {
					bulb[num] = false;
				}
				break;
				
			case 2:
				for (int i = Math.min(num, x); i <= Math.max(num, x); i++) {
					bulb[i] = !bulb[i];
				}
				break;
				
			case 3:
				for (int i = Math.min(num, x); i <= Math.max(num, x); i++) {
					bulb[i] = false;
				}
				break;
				
			case 4:
				for (int i = Math.min(num, x); i <= Math.max(num, x); i++) {
					bulb[i] = true;
				}
				break;
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if (bulb[i]) {
				sb.append(1).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
