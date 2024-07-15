import java.io.*;
import java.util.*;

public class Main {
	
	static long c;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
		
		bw.write(Long.toString(pow(a, b)));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static long pow(long a, long b) {
		if (b == 1) {
			return a % c;
		}
		
		long num = pow(a, b / 2);
		
		if (b % 2 == 1) {
			return (num * num % c) * a % c;
		}
		
		return num * num % c;
	}
}
