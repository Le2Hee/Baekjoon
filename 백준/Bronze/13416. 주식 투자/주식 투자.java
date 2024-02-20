import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int sum, n, max;
		StringTokenizer st;
		
		
		while (t-- > 0) {
			sum = 0;
			n = Integer.parseInt(br.readLine());
			
			while (n-- > 0) {
				max = Integer.MIN_VALUE;
				st = new StringTokenizer(br.readLine());

				while (st.hasMoreElements()) {
					int num = Integer.parseInt(st.nextToken());
					max = Math.max(max, num);
				}
				
				if (max > 0) {
					sum += max;
				}
			}
			
			sb.append(sum).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
