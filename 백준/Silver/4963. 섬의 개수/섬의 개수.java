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
	
	static int w, h, result;
	static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
	static int[] dy = {1, 1, 1, 0, 0, -1, -1, -1};
	static boolean[][] visit;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		StringTokenizer st;
		
		while (!(s = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(s);
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			visit = new boolean[h][w];
			map = new int[h][w];
			
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			result = 0;
			search();
			sb.append(result).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void search() {
		int num = 0;
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (!visit[i][j] && map[i][j] == 1) {
					num++;
					Queue<Coordinate> q = new LinkedList<>();
					q.add(new Coordinate(j, i));
					map[i][j] = num;
					visit[i][j] = true;
					
					while (!q.isEmpty()) {
						Coordinate c = q.remove();
						
						for (int k = 0; k < 8; k++) {
							int nextx = c.x + dx[k];
							int nexty = c.y + dy[k];
							
							if (check(nexty, nextx) && !visit[nexty][nextx] && map[nexty][nextx] == 1) {
								visit[nexty][nextx] = true;
								map[nexty][nextx] = num;
								q.add(new Coordinate(nextx, nexty));
							}
						}
					}
					
					result = num;
				}
			}
		}
	}
	
	private static boolean check(int y, int x) {
		return 0 <= x && 0 <= y && y < h && x < w;
	}
}