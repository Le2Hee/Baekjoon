import java.io.*;
import java.util.*;

public class Main {
	
	public static class Coordinates {
		int x, y;
		
		public Coordinates(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static List<Coordinates> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		String s = "";
		list = new LinkedList<>();
		
		for (int i = 0; i < h; i++) {
			s = br.readLine();
			for (int j = 0; j < w; j++) {
				if (s.charAt(j) == 'X') {
					list.add(new Coordinates(j, i));
				}
			}
		}
		
		List<Coordinates> last = new LinkedList<>();
		int minx = 11;
		int miny = 11;
		int maxx = -11;
		int maxy = -11;
		
		for (int i = 0; i < list.size(); i++) {
			if (check(list.get(i).x, list.get(i).y, i)) {
				last.add(list.get(i));
				minx = Math.min(minx, list.get(i).x);
				miny = Math.min(miny, list.get(i).y);
				maxx = Math.max(maxx, list.get(i).x);
				maxy = Math.max(maxy, list.get(i).y);
			}
		}
		
		char[][] map = new char[maxy - miny + 1][maxx - minx + 1];
		
		for (int i = 0; i < last.size(); i++) {
			int x = last.get(i).x - minx;
			int y = last.get(i).y - miny;
			
			map[y][x] = 'X';
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] != 'X') {
					map[i][j] = '.';
				}
				sb.append(map[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static boolean check(int x, int y, int index) {
		boolean bo = false;
		int count = 0;
		
		for (int j = 0; j < 4; j++) {
			int nowx = x + dx[j];
			int nowy = y + dy[j];
			
			if (search(nowx, nowy, index)) {
				count++;
				if (count >= 2) {
					bo = true;
					break;
				}
			}
		}
		
		return bo;
	}
	
	private static boolean search(int x, int y, int index) {
		boolean bo = false;
		
		for (int i = 0; i < list.size(); i++) {
			if (i != index && list.get(i).x == x && list.get(i).y == y) {
				bo = true;
				break;
			}
		}
		
		return bo;
	}
}