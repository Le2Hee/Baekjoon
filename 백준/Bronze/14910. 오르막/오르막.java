import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		
		while (st.hasMoreElements()) {
			int n = Integer.parseInt(st.nextToken());
			if (num <= n) {
				num = n;
			} else {
				sb.append("Bad");
				break;
			}
		}
		
		if (sb.length() == 0) {
			sb.append("Good");
		}
		
		System.out.println(sb);
	}
}