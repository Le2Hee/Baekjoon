import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[][] map;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static int n, heartx, hearty, waistx, waisty;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		String s = "";
		map = new boolean[n][n];
		heartx = -1;
		hearty = -1;
		waistx = -1;
		waistx = -1;
		
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == '*') {
					map[i][j] = true;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j]) {
					heartSearch(i, j);
				}
				
				if (heartx != -1) {
					break;
				}
			}
			
			if (heartx != -1) {
				break;
			}
		}
		
		sb.append(hearty + 1).append(" ").append(heartx + 1).append("\n");
		sb.append(LArm(hearty, heartx)).append(" ").append(RArm(hearty, heartx)).append(" ").append(waist(hearty, heartx)).append(" ").append(LLeg(waisty, waistx)).append(" ").append(RLeg(waisty, waistx));
		System.out.println(sb);
	}
	
	private static void heartSearch(int y, int x) {
		int nowx = x;
		int nowy = y;
		int count = 0;
		
		for (int i = 0; i < 4; i++) {
			int nextx = nowx + dx[i];
			int nexty = nowy + dy[i];
			
			if (check(nexty, nextx)) {
				if (map[nexty][nextx]) {
					count++;
				}
			} else {
				break;
			}
		}
		
		if (count == 4) {
			heartx = x;
			hearty = y;
		}
	}
	
	private static int LArm(int y, int x) {
		int nowx = x;
		int nowy = y;
		int count = 0;
		
		while (true) {
			nowx--;
			if (check(nowy, nowx)) {
				if (map[nowy][nowx]) {
					count++;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		return count;
	}
	
	private static int RArm(int y, int x) {
		int nowx = x;
		int nowy = y;
		int count = 0;
		
		while (true) {
			nowx++;
			if (check(nowy, nowx)) {
				if (map[nowy][nowx]) {
					count++;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		return count;
	}
	
	private static int waist(int y, int x) {
		int nowx = x;
		int nowy = y;
		int count = 0;
		
		while (true) {
			nowy++;
			if (check(nowy, nowx)) {
				if (map[nowy][nowx]) {
					count++;
					waistx = nowx;
					waisty = nowy;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		return count;
	}
	
	private static int LLeg(int y, int x) {
		int nowx = x - 1;
		int nowy = y + 1;
		int count = 1;
		
		while (true) {
			nowy++;
			if (check(nowy, nowx)) {
				if (map[nowy][nowx]) {
					count++;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		return count;
	}
	
	private static int RLeg(int y, int x) {
		int nowx = x + 1;
		int nowy = y + 1;
		int count = 1;
		
		while (true) {
			nowy++;
			if (check(nowy, nowx)) {
				if (map[nowy][nowx]) {
					count++;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		return count;
	}
	
	private static boolean check(int y, int x) {
		return x >= 0 && y >= 0 && y < n && x <n;
	}
}