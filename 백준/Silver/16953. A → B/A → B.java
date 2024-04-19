import java.io.*;
import java.util.*;

public class Main {
	
	static long m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		m = Long.parseLong(st.nextToken());
		long count = search(n, 1);
		
		bw.write(Long.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static long search(long n, long c) {
		long num = n;
		
		if (num == m) {
			return c;
		} else if (num < m) {
			long a = search(num * 2, c + 1);
			long b = search(num * 10 + 1, c + 1);
			
			if (a != -1 && b != -1) {
				return Math.min(a, b);
			} else if (a != -1 && b == -1) {
				return a;
			} else {
				return b;
			}
		}
		
		return -1;
	}
}