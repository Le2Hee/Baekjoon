import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		int count = 0;
		String[] names;
		boolean[] visit;
		StringTokenizer st;
		
		while (!(s = br.readLine()).equals("0")) {
			count++;
			
			int n = Integer.parseInt(s);
			names = new String[n + 1];
			visit = new boolean[n + 1];
			
			for (int i = 1; i <= n; i++) {
				names[i] = br.readLine();
			}
			
			for (int i = 0; i < 2 * n - 1; i++) {
				st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());
				visit[num] = !visit[num];
			}
			
			for (int i = 1; i <= n; i++) {
				if (visit[i]) {
					sb.append(count).append(" ").append(names[i]).append("\n");
					break;
				}
			}
		}
		
		System.out.println(sb);
	}
}