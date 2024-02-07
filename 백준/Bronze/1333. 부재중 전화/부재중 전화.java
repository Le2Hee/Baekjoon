import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int call = c;
		
		for (int i = 1; i <= n; i++) {
			int num = t * i + 5 * (i - 1);
			
			if (num <= call && call < num + 5) {
				sb.append(call);
				break;
			} else if (num + 5 <= call && num + t > call) {
				call += c;
			} else if (num > call) {
				call += c;
				i--;
			}
		}
		
		if (sb.length() == 0) {
			for (int i = ((t + 5) * n) - 5 + 1; ; i++) {
				if (i % c == 0) {
					sb.append(i);
					break;
				}
			}
		}
		
		System.out.println(sb);
	}
}