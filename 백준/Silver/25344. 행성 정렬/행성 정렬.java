import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Queue<Long> qu = new LinkedList<>();
		while (st.hasMoreElements()) {
			qu.add(Long.parseLong(st.nextToken()));
		}
		
		long a, b, num;
		while (qu.size() > 1) {
			a = qu.poll();
			b = qu.poll();
			num = gcd(a, b);
			qu.add(a * b / num);
		}
		
		bw.write(Long.toString(qu.poll()));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}
}
