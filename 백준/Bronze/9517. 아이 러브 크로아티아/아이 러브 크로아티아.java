import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int k = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int time = 210;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			char b = st.nextToken().charAt(0);
			
			time -= t;
			if (time <= 0) {
				if (sb.length() == 0) {
					sb.append(k);
				}
			} else {
				if (b == 'T') {
					k++;
					if (k == 9) {
						k = 1;
					}
				}
			}
		}
		
		System.out.println(sb);
	}
}
