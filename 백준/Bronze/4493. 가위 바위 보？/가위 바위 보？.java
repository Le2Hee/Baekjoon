import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int t;
		StringTokenizer st;
		
		while (n-- > 0) {
			t = Integer.parseInt(br.readLine());
			int ac = 0;
			int bc = 0;
			
			while (t-- > 0) {
				st = new StringTokenizer(br.readLine());
				
				char a = st.nextToken().charAt(0);
				char b = st.nextToken().charAt(0);
				
				if (a == 'R') {
					if (b == 'S') {
						ac++;
					} else if (b== 'P') {
						bc++;
					}
				} else if (a == 'S') {
					if (b == 'R') {
						bc++;
					} else if (b == 'P') {
						ac++;
					}
				} else {
					if (b == 'R') {
						ac++;
					} else if (b == 'S') {
						bc++;
					}
				}
			}
			
			if (ac > bc) {
				sb.append("Player 1").append("\n");
			} else if (ac == bc) {
				sb.append("TIE").append("\n");
			} else {
				sb.append("Player 2").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}