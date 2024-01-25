import java.io.*;
import java.util.*;

public class Main {
	
	public static class Coordinate {
		int x, y;
		
		public Coordinate(int xx, int yy) {
			x = xx;
			y = yy;
		}
	}
	
	static boolean[] visit; // 남, 서, 북, 동
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		visit = new boolean[4];
		visit[0] = true;
		int visitIndex = 0;
		int x = 0;
		int y = 0;
		List<Coordinate> list = new LinkedList<>();
		list.add(new Coordinate(x, y));
		
		int minx = 0;
		int miny = 0;
		int maxx = 0;
		int maxy = 0;
		
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'R') {
				visit[visitIndex] = false;
				visitIndex++;
				if (visitIndex == 4) {
					visitIndex = 0;
				}
				visit[visitIndex] = true;
			} else if (str.charAt(i) == 'L') {
				visit[visitIndex] = false;
				visitIndex--;
				if (visitIndex == -1) {
					visitIndex = 3;
				}
				visit[visitIndex] = true;
			} else if (str.charAt(i) == 'F') {
				if (visitIndex == 0) {
					y--;
				} else if (visitIndex == 1) {
					x--;
				} else if (visitIndex == 2) {
					y++;
				} else {
					x++;
				}
				
				minx = Math.min(minx, x);
				miny = Math.min(miny, y);
				
				list.add(new Coordinate(x, y));
			}
		}
		
		if (minx < 0) {
			for (Coordinate c : list) {
				c.x -= minx;
			}
			minx = 0;
		}
		
		if (miny < 0) {
			for (Coordinate c : list) {
				c.y -= miny;
			}
			miny = 0;
		}
		
		for (Coordinate c : list) {
			maxx = Math.max(maxx, c.x);
			maxy = Math.max(maxy, c.y);
		}
		
		char[][] map = new char[maxy - miny + 1][maxx - minx + 1];
		
		for (Coordinate c : list) {
			map[c.y][c.x] = '.';
		}
		
		for (int i = map.length - 1; i >= 0 ; i--) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] != '.') {
					map[i][j] = '#';
				}
				sb.append(map[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}