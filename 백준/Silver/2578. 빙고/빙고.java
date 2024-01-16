import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] map;
	static boolean[][] visit;
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		map = new int[5][5];
		visit = new boolean[5][5];
		StringTokenizer st;
		count = 0;
		
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] progress = new int[25];
		
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				progress[j + (i * 5)] = Integer.parseInt(st.nextToken());
			}
		}
		
		int index = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (progress[index] == map[i][j]) {
					visit[i][j] = true;
					check(j, i);
					if (count == 3) {
						sb.append(index + 1);
					}
					i = -1;
					index++;
					break;
				}
			}
			
			if (sb.length() != 0) {
				break;
			}
		}
		
		System.out.println(sb);
	}
	
	private static void check(int x, int y) {
		if (visit[y][0] && visit[y][1] && visit[y][2] && visit[y][3] && visit[y][4]) {
			count++;
		}
		
		if (count == 3) {
			return;
		}
		
		if (visit[0][x] && visit[1][x] && visit[2][x] && visit[3][x] && visit[4][x]) {
			count++;
		}
		
		if (count == 3) {
			return;
		}
		
		if (x == y) {
			if (visit[0][0] && visit[1][1] && visit[2][2] && visit[3][3] && visit[4][4]) {
				count++;
			}
		}
		
		if (count == 3) {
			return;
		}
		
		if (x + y == 4) {
			if (visit[4][0] && visit[3][1] && visit[2][2] && visit[1][3] && visit[0][4]) {
				count++;
			}
		}
	}
}