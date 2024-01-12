import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int c = 100;
		int s = 100;
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int fi = Integer.parseInt(st.nextToken());
			int se = Integer.parseInt(st.nextToken());
			
			if (fi > se) {
				s -= fi;
			} else if (fi < se) {
				c -= se;
			}
		}
		
		sb.append(c).append("\n").append(s);
		System.out.println(sb);
	}
}