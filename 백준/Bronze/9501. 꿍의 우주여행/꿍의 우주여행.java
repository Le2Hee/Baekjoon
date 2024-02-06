import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int count, n, d;
		double speed, fu, con, sum;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			count = 0;
			
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				speed = Double.parseDouble(st.nextToken());
				fu = Double.parseDouble(st.nextToken());
				con = Double.parseDouble(st.nextToken());
				sum = (speed / con) * fu;
				
				if (sum >= d) {
					count++;
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}
}