import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int num = 1;
		boolean direction = false;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int in = Integer.parseInt(st.nextToken());
			int out = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());
			
			if (dir == 1) {
				direction = !direction;
			}
			
			num /= in;
			num *= out;
		}
		
		if (!direction) {
			sb.append(0).append(" ");
		} else {
			sb.append(1).append(" ");
		}
		
		sb.append(num);
		System.out.println(sb);
	}
}