import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 1; i <= t; i++) {
			int count = 0;
			boolean check = true;
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreElements()) {
				count++;
				int num = Integer.parseInt(st.nextToken());
				
				if (count == 6) {
					count = 1;
				}
				
				if (count != num) {
					check = !check;
					break;
				}
			}
			
			if (check) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}