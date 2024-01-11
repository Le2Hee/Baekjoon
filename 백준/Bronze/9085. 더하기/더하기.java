import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			
			while (st.hasMoreElements()) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
}