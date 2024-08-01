import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 한 변의 길이
		int m = Integer.parseInt(br.readLine()); // 찾을 수
		
		int[][] grid = new int[n][n];
		boolean[][] visit = new boolean[n][n];
		int num = n * n;
		int cen = n / 2;
		
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		int dir = 0; // 남, 동, 북, 서
		
		int nowy = 0, nowx = 0, nextx, nexty;
		visit[nowy][nowx] = true;
		grid[nowy][nowx] = num;
		
		while (!(nowy == cen && nowx == cen)) {
			if (!check(nowy + dy[dir], nowx + dx[dir], n) || visit[nowy + dy[dir]][nowx + dx[dir]]) {
				dir++;
				
				if (dir == 4) {
					dir = 0;
				}
			}
			
			nexty = nowy + dy[dir];
			nextx = nowx + dx[dir];
			num--;
			
			visit[nexty][nextx] = true;
			grid[nexty][nextx] = num;
			
			nowy = nexty;
			nowx = nextx;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(grid[i][j]).append(" ");
				
				if (grid[i][j] == m) {
					nowy = i;
					nowx = j;
				}
			}
			sb.append("\n");
		}
		sb.append(nowy + 1).append(" ").append(nowx + 1);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean check(int y, int x, int n) {
		return 0 <= x && 0 <= y && x < n && y < n;
	}
}