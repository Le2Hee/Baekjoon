import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] g2017 = {500, 300, 200, 50, 30, 10};
		int[] p2017 = {1, 3, 6, 10, 15, 21};
		int[] g2018 = {512, 256, 128, 64, 32};
		int[] p2018 = {1, 3, 7, 15, 31};
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n2017 = Integer.parseInt(st.nextToken());
			int n2018 = Integer.parseInt(st.nextToken());
			int sum = 0;
			
			if (n2017 == 1) {
				sum += g2017[0];
			} else if (n2017 <= 21) {
				for (int i = 0; i < 5; i++) {
					if (p2017[i] < n2017 && p2017[i + 1] >= n2017) {
						sum += g2017[i + 1];
					}
				}
			}
			
			if (n2018 == 1) {
				sum += g2018[0];
			} else if (n2018 <= 31) {
				for (int i = 0; i < 4; i++) {
					if (p2018[i] < n2018 && p2018[i + 1] >= n2018) {
						sum += g2018[i + 1];
					}
				}
			}
			
			sb.append(sum * 10000).append("\n");
		}
		
		System.out.println(sb);
	}
}