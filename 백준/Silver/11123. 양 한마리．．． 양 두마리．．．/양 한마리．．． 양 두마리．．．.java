import java.io.*;
import java.util.*;

public class Main {
	
	static int h, w;
	static char[][] map;
	static boolean[][] visit;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int count;
		char[] str;
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			
			map = new char[h][w];
			visit = new boolean[h][w];
			
			for (int i = 0; i < h; i++) {
				str = br.readLine().toCharArray();
				
				for (int j = 0; j < w; j++) {
					map[i][j] = str[j];
					
					if (map[i][j] == '.') {
						visit[i][j] = true;
					}
				}
			}
			
			count = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!visit[i][j]) {
						count++;
						function(i, j);
					}
				}
			}
			
			sb.append(count).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void function(int y, int x) {
		Queue<Integer> yq = new LinkedList<>();
		Queue<Integer> xq = new LinkedList<>();
		yq.add(y);
		xq.add(x);
		visit[y][x] = true;
		
		int nowy, nowx, nexty, nextx;
		while (!yq.isEmpty()) {
			nowy = yq.poll();
			nowx = xq.poll();
			
			for (int i = 0; i < 4; i++) {
				nexty = nowy + dy[i];
				nextx = nowx + dx[i];
				
				if (check(nexty, nextx) && !visit[nexty][nextx]) {
					visit[nexty][nextx] = true;
					yq.add(nexty);
					xq.add(nextx);
				}
			}
		}
	}
	
	private static boolean check(int y, int x) {
		return x >= 0 && y >= 0 && x < w && y < h;
	}
}