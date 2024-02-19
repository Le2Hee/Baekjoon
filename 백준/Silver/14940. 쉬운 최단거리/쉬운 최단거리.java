import java.io.*;
import java.util.*;

public class Main {
	
	public static class Coordinate {
		int x, y;
		
		public Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int h, w;
	static int[][] map;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	static boolean[][] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		map = new int[h][w];
		visit = new boolean[h][w];
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if (map[i][j] == 0) {
					visit[i][j] = true;
				}
				
				if (map[i][j] == 2) {
					x = j;
					y = i;
				}
			}
		}
		
		find(x, y);
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (!visit[i][j]) {
					map[i][j] = -1;
				}
				
				sb.append(map[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void find(int x, int y) {
		Queue<Coordinate> q = new LinkedList<>();
		q.add(new Coordinate(x, y));
		
		int nowx = x;
		int nowy = y;
		map[nowy][nowx] = 0;
		visit[nowy][nowx] = true;
		
		while (!q.isEmpty()) {
			Coordinate c = q.remove();
			
			for (int i = 0; i < 4; i++) {
				int nextx = c.x + dx[i];
				int nexty = c.y + dy[i];
				
				if (check(nexty, nextx) && !visit[nexty][nextx]) {
					visit[nexty][nextx] = true;
					map[nexty][nextx] = map[c.y][c.x] + 1;
					q.add(new Coordinate(nextx, nexty));
				}
			}
		}
	}
	
	private static boolean check(int y, int x) {
		return 0 <= x && 0 <= y && y < h && x < w;
	}
}