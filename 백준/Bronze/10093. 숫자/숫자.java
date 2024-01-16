import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());

		if (n == m) {
			sb.append(0);
		} else if (n > m) {
			sb.append(n - m - 1).append("\n");
			for (long i = m + 1; i < n; i++) {
				sb.append(i).append(" ");
			}
		} else {
			sb.append(m - n - 1).append("\n");
			for (long i = n + 1; i < m; i++) {
				sb.append(i).append(" ");
			}
		}
		
		System.out.println(sb);
	}
}
