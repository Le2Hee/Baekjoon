import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 수열의 길이
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long even = 0;
		long odd = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				even += Long.parseLong(st.nextToken());
			} else {
				odd += Long.parseLong(st.nextToken());
			}
		}
		
		long count = 0;
		if (n == 3 && even < odd) {
			count = -1;
		} else {
			if (even > odd) {
				count = even - odd;
			} else {
				count = odd - even;
			}
		}
		
		bw.write(Long.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
