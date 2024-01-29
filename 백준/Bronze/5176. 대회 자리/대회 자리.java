import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int a, b, sum, num;
		boolean[] check;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sum = 0;
			check = new boolean[b + 1];
			
			for (int i = 0; i < a; i++) {
				num = Integer.parseInt(br.readLine());
				if (!check[num]) {
					check[num] = true;
				} else {
					sum++;
				}
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
}