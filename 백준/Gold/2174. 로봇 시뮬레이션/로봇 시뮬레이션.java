import java.io.*;
import java.util.*;

public class Main {

	public static class Coordinates {
		int x, y, direction;

		public Coordinates(int x, int y, int d) {
			this.x = x;
			this.y = y;
			direction = d;
		}
	}

	static int w, h;
	static StringBuilder sb = new StringBuilder();
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static char[] key = { 'N', 'E', 'S', 'W' };
	static List<Coordinates> list;
	static int clashIndex = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		list = new LinkedList<>();
		Coordinates coor;

		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int index = indexSearch(st.nextToken().charAt(0));
			coor = new Coordinates(x, y, index);
			list.add(coor);
		}
		
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int index = Integer.parseInt(st.nextToken()) - 1;
			char c = st.nextToken().charAt(0);
			int num = Integer.parseInt(st.nextToken());
			
			if (sb.length() == 0) {
				int nowx = list.get(index).x;
				int nowy = list.get(index).y;
				int dir = list.get(index).direction;
				
				if (c == 'F') {
					for (int i = 0; i < num; i++) {
						int nextx = nowx + dx[dir];
						int nexty = nowy + dy[dir];
						
						if(check(nextx, nexty) && !clashCheck(nextx, nexty)) {
							nowx = nextx;
							nowy = nexty;
						} else if (!check(nextx, nexty)) {
							sb.append("Robot ").append(index + 1).append(" crashes into the wall");
							break;
						} else if (clashCheck(nextx, nexty)) {
							sb.append("Robot ").append(index + 1).append(" crashes into robot ").append(clashIndex + 1);
							break;
						}
					}
				} else if (c == 'L') {
					for (int i = 0; i < num; i++) {
						dir--;
						if (dir == -1) {
							dir = 3;
						}
					}
				} else {
					for (int i = 0; i < num; i++) {
						dir++;
						if (dir == 4) {
							dir = 0;
						}
					}
				}
				
				list.get(index).x = nowx;
				list.get(index).y = nowy;
				list.get(index).direction = dir;
			}
		}
		
		if (sb.length() == 0) {
			sb.append("OK");
		}
		
		System.out.println(sb);
	}

	private static int indexSearch(char c) {
		int index = 0;
		for (int i = 0; i < 4; i++) {
			if (key[i] == c) {
				index = i;
			}
		}
		return index;
	}
	
	private static boolean check(int x, int y) {
		return x > 0 && y > 0 && x <= w && y <= h;
	}
	
	private static boolean clashCheck(int x, int y) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).x == x && list.get(i).y == y) {
				clashIndex = i;
				return true;
			}
		}
		return false;
	}
}