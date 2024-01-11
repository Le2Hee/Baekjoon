import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = 10 * n; // 30초마다 10원씩
		int m = 15 * n; // 60초마다 15원
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			y += 10 * (num / 30);
			m += 15 * (num / 60);
		}
		
		if (m < y) {
			sb.append("M ").append(m);
		} else if (m == y) {
			sb.append("Y M ").append(y);
		} else {
			sb.append("Y ").append(y);
		}
		
		System.out.println(sb);
	}
}