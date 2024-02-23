import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static int[] dx = {-1, 1, -1, 1};
	static int[] dy = {-1, -1, 1, 1};
	static boolean[][] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken()) - 1;
		int x = Integer.parseInt(st.nextToken()) - 1;
		visit = new boolean[n][n];
		visit[y][x] = true;
		
		search(y, x);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visit[i][j]) {
					sb.append("v");
				} else {
					sb.append(".");
				}
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
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
			
			if (check(nexty, nextx) && !visit[nexty][nextx]) {
				visit[nexty][nextx] = true;
				search(nexty, nextx);
			}
		}
	}
	
	private static boolean check(int y, int x) {
		return 0 <= x && 0 <= y && y < n && x < n;
	}
}