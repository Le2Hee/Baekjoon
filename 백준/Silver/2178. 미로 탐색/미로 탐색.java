import java.io.*;
import java.util.*;

public class Main {
	
	static int n, m;
	static int[][] map;
	static boolean[][] visit;
	static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
	static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		visit = new boolean[n][m];
		
		String[] str;
		
		for (int i = 0; i < n; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < str.length; j++) {
				map[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		visit[0][0] = true;
		run(0, 0);
		System.out.println(map[n - 1][m - 1]);
	}
	
	private static void run(int x, int y) {
		Queue<int[]> qu = new LinkedList<int[]>();
		qu.add(new int[] {x, y});
		
		while (!qu.isEmpty()) {
			int[] now = qu.poll();
			int nowx = now[0];
			int nowy = now[1];
			
			for (int i = 0; i < 4; i++) {
				int nextx = nowx + dx[i];
				int nexty = nowy + dy[i];
				
				if (nextx < 0 || nexty < 0 || nextx >= n || nexty >= m || visit[nextx][nexty] || map[nextx][nexty] == 0) {
					continue;
				}
				
				qu.add(new int[] {nextx, nexty});
				map[nextx][nexty] = map[nowx][nowy] + 1;
				visit[nextx][nexty] = true;
			}
		}
	}
}