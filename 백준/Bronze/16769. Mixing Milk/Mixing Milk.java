import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int aMax = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int bMax = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int cMax = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 1) {
				b += a;
				a = 0;
				if (bMax < b) {
					a = b - bMax;
					b = bMax;
				}
			} else if (i % 3 == 2) {
				c += b;
				b = 0;
				if (cMax < c) {
					b = c - cMax;
					c = cMax;
				}
			} else {
				a += c;
				c = 0;
				if (aMax < a) {
					c = a - aMax;
					a = aMax;
				}
			}
		}
		
		sb.append(a).append("\n").append(b).append("\n").append(c);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}