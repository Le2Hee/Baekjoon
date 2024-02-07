import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		boolean[] game = new boolean[n + 1];
		game[b] = true;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			if (game[s] || game[e]) {
				game[s] = !game[s];
				game[e] = !game[e];
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if (game[i]) {
				System.out.println(i);
				break;
			}
		}
	}
}