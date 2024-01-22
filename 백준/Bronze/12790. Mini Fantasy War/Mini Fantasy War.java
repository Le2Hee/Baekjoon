import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int hp = Integer.parseInt(st.nextToken());
			int mp = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			hp += Integer.parseInt(st.nextToken());
			mp += Integer.parseInt(st.nextToken());
			a += Integer.parseInt(st.nextToken());
			d += Integer.parseInt(st.nextToken());
			
			if (hp < 1) {
				hp = 1;
			}
			
			if (mp < 1) {
				mp = 1;
			}
			
			if (a < 0) {
				a = 0;
			}
			
			int result = hp + (5 * mp) + (2 * a) + (2 * d);
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}
}