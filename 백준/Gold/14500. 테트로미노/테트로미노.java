import java.io.*;
import java.util.*;

public class Main {
	
	static int[] dx = {1, 2, 3, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 2, 0, 1, 1, 1, 1, 2, 2, 0, 0, -1, 0, 1, 2, 1, 0, 0, 1, 2, 2, 0, 1, 1, 1, 1, 2, 0, -1, -1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 0, 1, 0};
	static int[] dy = {0, 0, 0, 1, 2, 3, 0, 1, 1, 1, 2, 2, 0, 0, 1, 0, 1, 2, 0, 0, -1, 1, 2, 2, 1, 1, 1, 0, 1, 2, 0, 0, 1, 1, 1, 2, 0, -1, -1, 1, 1, 2, 0, 1, 1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 1, 2};
	static int h, w, max = 0;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		
		map = new int[h][w];
		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < w; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				function(i, j);
			}
		}
		
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 테트로미노 범위 안에 최대 값을 구하는 함수.
	private static void function(int y, int x) {
		int nowy = y;
		int nowx = x;
		int nexty, nextx;
		int sum = map[y][x];
		
		for (int i = 0; i < 57; i++) {
			nexty = nowy + dy[i];
			nextx = nowx + dx[i];
			
			if (check(nexty, nextx)) {
				sum += map[nexty][nextx];
				
				if (i % 3 == 2) {
					max = Math.max(max, sum);
					sum = map[y][x];
				}
			} else {
				if (i % 3 == 0) {
					i += 2;
				} else if (i % 3 == 1) {
					i++;
				}
				
				sum = map[y][x];
			}
		}
	}
	
	// 참조하는 좌표가 범위 안에 있는지 확인하는 함수.
	private static boolean check(int y, int x) {
		return y >= 0 && x >= 0 && y < h & x < w;
	}
}
