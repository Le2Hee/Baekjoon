import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] map;
	static int[] dx = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
	static int[] dy = {1, 1, 1, 0, 0, 0, -1, -1, -1};
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		String s = "";
		
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < n; j++) {
				char c = s.charAt(j);
				
				if (c == '.') {
					map[i][j] = 0;
				} else {
					map[i][j] = c - '0';
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 0) {
					int num = mineSearch(i, j);
					if (num < 10) {
						sb.append(num);
					} else {
						sb.append("M");
					}
				} else {
					sb.append("*");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int mineSearch(int y, int x) {
		int nowx = x;
		int nowy = y;
		int sum = 0;
		
		for (int i = 0; i < 9; i++) {
			int nextx = nowx + dx[i];
			int nexty = nowy + dy[i];
			
			if (check(nexty, nextx)) {
				sum += map[nexty][nextx];
			}
		}
		
		return sum;
	}
	
	private static boolean check(int y, int x) {
		return 0 <= x && 0 <= y && y < n && x < n;
	}
}