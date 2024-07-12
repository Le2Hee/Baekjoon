import java.io.*;
import java.util.*;

public class Main {
	
	static int count = 0;
	static int maxx, maxy, m;
	static int[][] dp; // 현재 위치에서 먹을 수 있는 사탕의 개수
	static int[][] map; // 사탕의 개수를 저장하는 배열
	static int[] dx = {0, -1}; // 위쪽, 왼쪽
	static int[] dy = {-1, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int x, y;
		maxx = 0;
		maxy = 0;
		int[][] coordinates = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			coordinates[i][0] = y;
			coordinates[i][1] = x;
			
			maxx = Math.max(maxx, x);
			maxy = Math.max(maxy, y);
		}
		
		map = new int[maxy + 1][maxx + 1];
		dp = new int[maxy + 1][maxx + 1];
		
		for (int i = 0; i < n; i++) {
			map[coordinates[i][0]][coordinates[i][1]] = m;
		}
		
		function();
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void function() {
		int nexty, nextx, dis;
		
		for (int i = 0; i <= maxy; i++) {
			for (int j = 0; j <= maxx; j++) {
				for (int k = 0; k < 2; k++) {
					nexty = i + dy[k];
					nextx = j + dx[k];
					dis = i + j;
					
					if (check(nexty, nextx)) {
						dp[i][j] = Math.max(dp[i][j], dp[nexty][nextx] + (map[i][j] != 0 ? (map[i][j] - dis < 0 ? 0 : map[i][j] - dis) : 0));
					}
				}
				
				count = Math.max(count, dp[i][j]);
			}
		}
	}
	
	private static boolean check(int y, int x) {
		return 0 <= x && 0 <= y && x <= maxx && y <= maxy; 
	}
}
