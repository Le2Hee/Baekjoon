import java.io.*;
import java.util.*;

public class Main {
	
	static int n, count = 0;
	static int[][] home;
	static boolean[][] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine()); // 집의 크기
		
		home = new int[n][n];
		visit = new boolean[n][n];
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				home[i][j] = Integer.parseInt(st.nextToken());
				
				if (home[i][j] == 1) {
					visit[i][j] = true;
				}
			}
		}
		
		visit[0][0] = true;
		visit[0][1] = true;
		
		recur(0, 1, 1);
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void recur(int y, int x, int c) {
		int nexty = y + 1;
		int nextx = x + 1;
		
		// 대각선
		if (check(nexty, nextx) && !visit[y][nextx] && !visit[nexty][x] && !visit[nexty][nextx]) {
			if (countcheck(nexty, nextx)) {
				count++;
			} else {
				visit[nexty][nextx] = true;
				visit[y][nextx] = true;
				visit[nexty][x] = true;
				
				recur(nexty, nextx, 3);
				
				visit[nexty][nextx] = false;
				visit[y][nextx] = false;
				visit[nexty][x] = false;
			}
		}
		
		// 세로
		if (c == 2 || c == 3) {
			nexty = y + 1;
			
			if (check(nexty, x) && !visit[nexty][x]) {
				if (countcheck(nexty, x)) {
					count++;
				} else {
					visit[nexty][x] = true;
					recur(nexty, x, 2);
					visit[nexty][x] = false;
				}
			}
		}
		
		// 가로
		if (c == 1 || c == 3) {
			nextx = x + 1;
			
			if (check(y, nextx) && !visit[y][nextx]) {
				if (countcheck(y, nextx)) {
					count++;
				} else {
					visit [y][nextx] = true;
					recur(y, nextx, 1);
					visit[y][nextx] = false;
				}
			}
		}
	}
	
	private static boolean countcheck(int y, int x) {
		return y == n - 1 && x == n - 1;
	}
	
	private static boolean check(int y, int x) {
		return 0 <= y && 0 <= x && y < n && x < n;
	}
}