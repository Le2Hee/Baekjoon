import java.io.*;
import java.util.*;

public class Main {
	static int[] dirX = {0, 0, -1, 1};
	static int[] dirY = {-1, 1, 0, 0};
	static int m, n, k, dirx, diry;
	static int[][] land;
	static boolean[][] visit;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken()); // 가로길이
			n = Integer.parseInt(st.nextToken()); // 세로길이
			k = Integer.parseInt(st.nextToken()); // 배추의 개수
			
			land = new int[n][m];
			visit = new boolean[n][m];
			
			while (k-- > 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				land[y][x] = 1;
			}
			
			int count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (land[i][j] == 1 && visit[i][j] == false) {
						count++;
						dfs(j, i);
					}
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void dfs(int x, int y) {
		visit[y][x] = true;
		
		for (int i = 0; i < 4; i++) {
			dirx = x + dirX[i];
			diry = y + dirY[i];
			
			if (check() && visit[diry][dirx] == false && land[diry][dirx] == 1) {
				dfs(dirx, diry);
			}
		}
		
		
	}
	
	private static boolean check() {
		return (dirx >= 0 && dirx < m && diry >= 0 && diry < n);
	}
}