import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int csum = 0;
			double gsum = 0;
			
			while (n-- > 0) {
				st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken());
				double g = Double.parseDouble(st.nextToken());
				csum += c;
				gsum += g * c;
			}
			
			String str = String.format("%.1f", gsum / csum);
			sb.append(csum).append(" ").append(str).append("\n");
		}
		
		System.out.println(sb);
	}
}