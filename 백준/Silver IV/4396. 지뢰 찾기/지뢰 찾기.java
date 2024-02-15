import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static int[] dx = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
	static int[] dy = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
	static char[][] mine, open;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		mine = new char[n][n];
		open = new char[n][n];
		
		String s = "";
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < n; j++) {
				mine[i][j] = s.charAt(j);
			}
		}
		
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < n; j++) {
				open[i][j] = s.charAt(j);
			}
		}
		
		boolean mineOpen = false;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (open[i][j] != '.') {
					if (mine[i][j] != '*') {
						openSearch(i, j);
					} else {
						mineOpen = true;
					}
				}
			}
		}
		
		if (mineOpen) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (mine[i][j] == '*') {
						open[i][j] = '*';
					}
					sb.append(open[i][j]);
				}
				sb.append("\n");
			}
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sb.append(open[i][j]);
				}
				sb.append("\n");
			}
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
	
	private static void openSearch(int y, int x) {
		int nowx = x;
		int nowy = y;
		int count = 0;
		
		for (int i = 0; i < 9; i++) {
			int nextx = nowx + dx[i];
			int nexty = nowy + dy[i];
			
			if (check(nexty, nextx) && mine[nexty][nextx] == '*') {
				count++;
			}
		}
		
		open[y][x] = (char)(count + '0');
	}
	
	private static boolean check(int y, int x) {
		return 0 <= y && 0 <= x && y < n && x < n;
	}
}
