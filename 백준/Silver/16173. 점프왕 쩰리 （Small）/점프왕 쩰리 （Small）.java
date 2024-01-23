import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static int[][] map;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		StringTokenizer st;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		search(0, 0);
		
		if (sb.length() == 0) {
			sb.append("Hing");
		}
		
		System.out.println(sb);
	}
	
	private static void search(int x, int y) {
		int[] dx = {map[y][x], 0};
		int[] dy = {0, map[y][x]};
		
		if (map[y][x] != 0) {
			for (int i = 0; i < 2; i++) {
				int nextx = x + dx[i];
				int nexty = y + dy[i];
				
				if (nextx == n - 1 && nexty == n - 1) {
					if (sb.length() == 0) {
						sb.append("HaruHaru");
					}
				} else if (nextx >= n || nexty >= n) {
					
				} else {
					if (sb.length() == 0) {
						search(nextx, nexty);
					}
				}
			}
		}
	}
}