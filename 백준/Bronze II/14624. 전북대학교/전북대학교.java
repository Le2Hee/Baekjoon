import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		if (n % 2 == 0) {
			sb.append("I LOVE CBNU");
		} else {
			int m = n / 2;
			int count = 1;
			
			for (int i = 0; i < n; i++) {
				sb.append("*");
			}
			sb.append("\n");
			
			for (int i = 0; i < m; i++) {
				sb.append(" ");
			}
			sb.append("*\n");
			
			m--;
			
			while (m >= 0) {
				for (int i = 0; i < m; i++) {
					sb.append(" ");
				}
				sb.append("*");
				
				for (int i = 0; i < count; i++) {
					sb.append(" ");
				}
				sb.append("*\n");
				
				m--;
				count += 2;
			}
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}