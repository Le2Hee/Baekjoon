import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[101][101];
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int rx = Integer.parseInt(st.nextToken());
			int ry = Integer.parseInt(st.nextToken());
			int lx = Integer.parseInt(st.nextToken());
			int ly = Integer.parseInt(st.nextToken());
			
			for (int i = ry; i <= ly; i++) {
				for (int j = rx; j <= lx; j++) {
					map[i][j]++;
				}
			}
		}
		
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (map[i][j] > m) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}