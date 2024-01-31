import java.io.*;
import java.util.*;

public class Main {
	
	static int[] dx = {1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1};
	static int[][] map = new int[19][19];
	static int resultx = 0;
	static int resulty = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		for (int i = 0; i < 19; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 19; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				if (map[i][j] == 1 || map[i][j] == 2) {
					if (search(map[i][j], i, j)) {
						sb.append(map[i][j]).append("\n").append(resulty + 1).append(" ").append(resultx + 1);
						break;
					}
				}
			}
			
			if (sb.length() != 0) {
				break;
			}
		}
		
		if (sb.length() == 0) {
			sb.append(0);
		}
		
		System.out.println(sb);
	}
	
	private static boolean search(int n, int y, int x) {
		boolean bo = true;
		
		for (int i = 0; i < 4; i++) {
			int subx = x;
			int suby = y;
			bo = true;
			
			if (backCheck(i, y, x)) {
				if (n == 2 && y == 18 && x == 14) {System.out.println("!!");};
				bo = false;
				continue;
			}
			
			for (int j = 0; j < 5; j++) {
				int nowx = subx + dx[i];
				int nowy = suby + dy[i];
				
				if (j != 4 && !check(nowy, nowx)) {
					if (n == 2 && y == 18 && x == 14) {System.out.println("!!!!");};
					bo = false;
					break;
				}
				
				if (j != 4 && map[nowy][nowx] != n) {
					bo = false;
					break;
				} else if (check(nowy, nowx) && j == 4 && map[nowy][nowx] == n) {
					bo = false;
					break;
				}
				subx = nowx;
				suby = nowy;
			}
			if (bo) {
				if (i == 3) {
					resulty = y + 4;
					resultx = x - 4;
				} else {
					resulty = y;
					resultx = x;
				}
				break;
			}
		}
		return bo;
	}
	
	private static boolean check(int y, int x) {
		return y >= 0 && y < 19 && x >= 0 && x < 19;
	}
	
	private static boolean backCheck(int index, int y, int x) {
		if (index == 0) {
			return x > 0 && map[y][x] == map[y][x - 1];
		} else if (index == 1) {
			return x > 0 && y > 0 && map[y][x] == map[y - 1][x - 1];
		} else if (index == 2) {
			return y > 0 && map[y][x] == map[y - 1][x];
		} else {
			return x < 18 && y > 0 && map[y][x] == map[y - 1][x + 1];
		}
	}
}