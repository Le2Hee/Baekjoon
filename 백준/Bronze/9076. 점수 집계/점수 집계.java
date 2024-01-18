import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (n-- > 0) {
			int[] num = new int[5];
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < 5; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(num);
			
			if (num[3] - num[1] >= 4) {
				sb.append("KIN");
			} else {
				int sum = num[1] + num[2] + num[3];
				sb.append(sum);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}