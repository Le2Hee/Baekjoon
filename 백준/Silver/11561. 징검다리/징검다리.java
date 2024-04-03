import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		long n, start, end, mid, sum, count;
		while (t-- > 0) {
			n = Long.parseLong(br.readLine());
			
			start = 0;
			end = (long)Math.sqrt(n * 2 - 1);
			count = 0;
			
			while (start <= end) {
				mid = (start + end) / 2;
				sum = mid * (mid + 1) / 2;
				
				if (sum <= n) {
					count = Math.max(mid, count);
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
			
			sb.append(count).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
