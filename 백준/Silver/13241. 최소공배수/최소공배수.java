import java.io.*;
import java.util.*;

public class Main {
	
	static long a, b;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		if (a == b) {
			sb.append(a);
		} else {
			sb.append(search());
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static long search() {
		for (long i = a; ; i += a) {
			if (i % b == 0) {
				return i;
			}
		}
	}
}