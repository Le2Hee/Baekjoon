import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		
		if (k > (n >> 1)) {
			k = n >> 1;
		}
		
		int x = 0;
		int y = 0;
		
		while (k-- > 0) {
			for (char c : s.toCharArray()) {
				if (c == 'U') {
					y++;
				} else if (c == 'D') {
					y--;
				} else if (c == 'R') {
					x++;
				} else {
					x--;
				}
				
				if (x == 0 && y == 0) {
					sb.append("YES");
					break;
				}
			}
			
			if (sb.length() != 0) {
				break;
			}
		}
		
		if (sb.length() == 0) {
			sb.append("NO");
		}
		
		System.out.println(sb);
	}
}
