import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long x1 = Long.parseLong(st.nextToken());
		long y1 = Long.parseLong(st.nextToken());
		long r1 = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long x2 = Long.parseLong(st.nextToken());
		long y2 = Long.parseLong(st.nextToken());
		long r2 = Long.parseLong(st.nextToken());
		
		double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		if (distance < r1 + r2) {
			sb.append("YES");
		} else {
			sb.append("NO");
		}
		
		System.out.println(sb);
	}
}