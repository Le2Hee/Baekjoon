import java.io.*;
import java.util.*;

public class Main {
	
	static int h, w;
	static boolean[][] visit;
	static char[][] map;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	static List<String> list = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		visit = new boolean[h][w];
		map = new char[h][w];
		
		char[] arr;
		for (int i = 0; i < h; i++) {
			arr = br.readLine().toCharArray();
			for (int j = 0; j < w; j++) {
				map[i][j] = arr[j];
				
				if (map[i][j] == '.') {
					visit[i][j] = true;
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (crossCheck(i, j) && map[i][j] == '*') {
					print(search(i, j), i, j);
				}
			}
		}
		
		boolean check = true;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (!visit[i][j]) {
					check = false;
					break;
				}
			}
		}
		
		if (check) {
			sb.append(list.size()).append("\n");
			
			for (String s : list) {
				sb.append(s).append("\n");
			}
		} else {
			sb.append(-1);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void print(int len, int y, int x) {
		for (int i = len; i > 0; i--) {
			list.add((y + 1) + " " + (x + 1) + " " + i);
		}
	}
	
	private static int search(int y, int x) {
		int len = minLen(y, x), nowx, nowy;
		visit[y][x] = true;
		
		for (int i = 0; i < 4; i++) {
			nowx = x;
			nowy = y;
			
			for (int j = 0; j < len; j++) {
				int nextx = nowx + dx[i];
				int nexty = nowy + dy[i];
				
				visit[nexty][nextx] = true;
				nowx = nextx;
				nowy = nexty;
			}
		}
		
		return len;
	}
	
	private static int minLen(int y, int x) {
		int count = 101,  nowx , nowy;
		
		for (int i = 0; i < 4; i++) {
			nowx = x;
			nowy = y;
			int c = 0;
			
			while (true) {
				int nextx = nowx + dx[i];
				int nexty = nowy + dy[i];
				
				if (!check(nexty, nextx) || map[nexty][nextx] != '*') {
					break;
				} else {
					c++;
					nowx = nextx;
					nowy = nexty;
				}
			}
			
			count = Math.min(count, c);
		}
		
		return count;
	}
	
	private static boolean crossCheck(int y, int x) {
		boolean result = true;
		int nowx = x, nowy = y;
		
		for (int i = 0; i < 4; i++) {
			int nextx = nowx + dx[i];
			int nexty = nowy + dy[i];
			
			if (!check(nexty, nextx) || map[nexty][nextx] != '*') {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	private static boolean check(int y, int x) {
		return 0 <= y && 0 <= x && y < h && x < w;
	}
}