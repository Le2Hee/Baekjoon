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
	
	static int[] dx = {1, -1, 2, 2, -1, 1, -2, -2};
	static int[] dy = {2, 2, 1, -1, -2, -2, -1, 1};
	static List<Coordinates> list;
	static StringBuilder sb;
	static boolean[][] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		String s = "";
		list = new LinkedList<>();
		Coordinates c;
		visit = new boolean[6][6];
		
		for (int i = 1; i <= 36; i++) {
			s = br.readLine();
			int w = s.charAt(0) - 'A';
			int h = s.charAt(1) - '0' - 1;
			
			c = new Coordinates(w, h);
			list.add(c);
			visit[h][w] = true;
		}
		
		if (!visitSearch()) {
			sb.append("Invalid");
		} else {
			search();
		}
		
		System.out.println(sb);
	}
	
	private static void search() {
		boolean bo = false;
		
		for (int i = 0; i < 36; i++) {
			bo = false;
			for (int j = 0; j < 8; j++) {
				if (i == 35) {
					if (list.get(i).x + dx[j] == list.get(0).x && list.get(i).y + dy[j] == list.get(0).y) {
						bo = true;
					}
				} else if (list.get(i).x + dx[j] == list.get(i + 1).x && list.get(i).y + dy[j] == list.get(i + 1).y) {
					bo = true;
					break;
				}
			}
			
			if (!bo) {
				sb.append("Invalid");
				break;
			}
		}
		
		if (sb.length() == 0) {
			sb.append("Valid");
		}
	}
	
	private static boolean visitSearch() {
		boolean bo = true;
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (!visit[i][j]) {
					return false;
				}
			}
		}
		
		return bo;
	}
}