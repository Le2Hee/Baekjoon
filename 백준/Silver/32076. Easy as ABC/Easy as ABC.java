import java.io.*;
import java.util.*;

public class Main {
	
	private static class Coordinate implements Comparable<Coordinate> {
		int x, y;
		String str;
		boolean[][] visit;
		
		public Coordinate (int y, int x, boolean[][] v, String s) {
			this.y = y;
			this.x = x;
			str = s;
			visit = v;
		}
		
		@Override
		public int compareTo(Coordinate o) {
			return str.compareTo(o.str);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		char[][] grid = new char[3][3];
		char[] arr;
		
		for (int i = 0; i < 3; i++) {
			arr = br.readLine().toCharArray();
			
			for (int j = 0; j < 3; j++) {
				grid[i][j] = arr[j];
			}
		}
		
		PriorityQueue<Coordinate> q = new PriorityQueue<>();
		boolean[][] visit;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				visit = new boolean[3][3];
				visit[i][j] = true;
				q.add(new Coordinate(i, j, visit, String.valueOf(grid[i][j])));
			}
		}
		
		int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
		int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
		
		Coordinate cd;
		int nexty, nextx;
		while (!q.isEmpty()) {
			cd = q.poll();
			
			if (cd.str.length() == 3) {
				sb.append(cd.str);
				break;
			}
			
			for (int i = 0; i < 8; i++) {
				nexty = cd.y + dy[i];
				nextx = cd.x + dx[i];
				
				if (check(nexty, nextx) && !cd.visit[nexty][nextx]) {
					visit = truecheck(cd.visit);
					q.add(new Coordinate(nexty, nextx, visit, cd.str + grid[nexty][nextx]));
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean[][] truecheck(boolean[][] v) {
		boolean[][] visit = new boolean[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				visit[i][j] = v[i][j];
			}
		}
		
		return visit;
	}
	
	private static boolean check (int y, int x) {
		return 0 <= x && 0 <= y && y < 3 && x < 3;
	}
}