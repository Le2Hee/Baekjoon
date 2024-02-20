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
	
	static int w, h, day = 1;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static int[][] map;
	static Queue<Coordinate> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		map = new int[h][w];
		
		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if (map[i][j] == 1) {
					q.add(new Coordinate(j, i));
				}
			}
		}
		
		tomato();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (map[i][j] == 0) {
					sb.append(-1);
					break;
				}
			}
			
			if (sb.length() != 0) {
				break;
			}
		}
		
		bw.write(sb.length() == 0 ? Integer.toString(day - 1) : sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void tomato() {
		while (!q.isEmpty()) {
			Coordinate c = q.remove();
			
			for (int i = 0; i < 4; i++) {
				int nextx = c.x + dx[i];
				int nexty = c.y + dy[i];
				
				if (check(nexty, nextx) && map[nexty][nextx] == 0) {
					map[nexty][nextx] = map[c.y][c.x] + 1;
					day = map[nexty][nextx];
					q.add(new Coordinate(nextx, nexty));
				}
			}
		}
	}
	
	private static boolean check(int y, int x) {
		return 0 <= x && 0 <= y && x < w && y < h;
	}
}