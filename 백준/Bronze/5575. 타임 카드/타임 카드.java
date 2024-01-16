import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 3;
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int starth = Integer.parseInt(st.nextToken());
			int startm = Integer.parseInt(st.nextToken());
			int starts = Integer.parseInt(st.nextToken());
			int endh = Integer.parseInt(st.nextToken());
			int endm = Integer.parseInt(st.nextToken());
			int ends = Integer.parseInt(st.nextToken());
			
			int h = endh - starth;
			int m = endm - startm;
			int s = ends - starts;
			
			if (s < 0) {
				m--;
				s += 60;
			}
			
			if (m < 0) {
				h--;
				m += 60;
			}
			
			sb.append(h).append(" ").append(m).append(" ").append(s).append("\n");
		}
		
		System.out.println(sb);
	}
}