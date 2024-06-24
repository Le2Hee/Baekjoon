import java.io.*;
import java.util.*;

public class Main {
	
	static int h, w;
	static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
	static int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
	static char[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String s;
		StringTokenizer st;
		
		while (!(s = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(s);
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			
			map = new char[h][w];
			for (int i = 0; i < h; i++) {
				s = br.readLine();
				
				for (int j = 0; j < w; j++) {
					map[i][j] = s.charAt(j);
				}
			}
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == '*') {
						sb.append(map[i][j]);
					} else {
						sb.append(find(i, j));
					}
				}
				sb.append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int find(int y, int x) {
		int nowy = y;
		int nowx = x;
		int count = 0;
		int nexty, nextx;
		
		for (int i = 0; i < 8; i++) {
			nexty = nowy + dy[i];
			nextx = nowx + dx[i];
			
			if (check(nexty,nextx) && map[nexty][nextx] == '*') {
				count++;
			}
		}
		
		return count;
	}
	
	private static boolean check(int y, int x) {
		return y >= 0 && x >= 0 && y < h && x < w; 
	}
}
