import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		char[] roulette = new char[n];
		int now = 0;
		
		for (int i = 0; i < n; i++) {
			roulette[i] = '?';
		}
		
		while (k-- > 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			char c = st.nextToken().charAt(0);
			
			now += s;
			while (now >= n) {
				now -= n;
			}
			
			if (roulette[now] == '?') {
				roulette[now] = c;
			} else {
				if (roulette[now] != c) {
					sb.append("!");
					break;
				}
			}
		}
		
		if (sb.length() == 0) {
			int[] count = new int[26];
			for (int i = 0; i < n; i++) {
				if (roulette[i] != '?') {
					count[roulette[i] - 'A']++;
					if (count[roulette[i] - 'A'] > 1) {
						sb.append("!");
						break;
					}
				}
			}
		}
		
		if (sb.length() == 0) {
			for (int i = now; i >= 0; i--) {
				sb.append(roulette[i]);
			}
			
			for (int i = n - 1; i > now; i--) {
				sb.append(roulette[i]);
			}
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}
