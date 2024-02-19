import java.io.*;
import java.util.*;

public class Main {
	
	static int h, w, count = 0;
	static char[][] map;
	static boolean[][] visit;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		map = new char[h][w];
		visit = new boolean[h][w];
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < h; i++) {
			char[] str = br.readLine().toCharArray();
			for (int j = 0; j < w; j++) {
				map[i][j] = str[j];
				
				if (map[i][j] == 'I') {
					x = j;
					y = i;
					visit[i][j] = true;
				} else if (map[i][j] == 'X') {
					visit[i][j] = true;
				}
			}
		}
		
		search(y, x);
		
		bw.write(count == 0 ? "TT" : Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void search(int y, int x) {
		int nowx = x;
		int nowy = y;
		
		for (int i = 0; i < 4; i++) {
			int nextx = nowx + dx[i];
			int nexty = nowy + dy[i];
			
			if (check(nexty, nextx)) {
				visit[nexty][nextx] = true;
				search(nexty, nextx);
				if (map[nexty][nextx] == 'P') {
					count++;
				}
			}
		}
	}
	
	private static boolean check(int y, int x) {
		return x >= 0 && y >= 0 && x < w && y < h && !visit[y][x];
	}
}