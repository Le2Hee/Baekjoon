import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static int[][] map;
	static boolean[][] visit;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int count = 2;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		visit = new boolean[n][n];
		String[] str;
		
		for (int i = 0; i < n; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < str.length; j++) {
				map[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		List<Integer> result = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && !visit[i][j]) {
					visit[i][j] = true;
					result.add(run(i, j));
					count++;
				}
			}
		}
		
		sb.append(count - 2).append("\n");
		Collections.sort(result);
		for (int num : result) {
			sb.append(num).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int run(int x, int y) {
		Queue<int[]> qu = new LinkedList<int[]>();
		qu.add(new int[] {x, y});
		int c = 0;
		
		while (!qu.isEmpty()) {
			c++;
			int[] now = qu.poll();
			int nowx = now[0];
			int nowy = now[1];
			
			for (int i = 0; i < 4; i++) {
				int nextx = nowx + dx[i];
				int nexty = nowy + dy[i];
				
				if (nextx < 0 || nexty < 0 || nextx >= n || nexty >= n || visit[nextx][nexty] || map[nextx][nexty] == 0) {
					continue;
				}
				
				qu.add(new int[] {nextx, nexty});
				map[nextx][nexty] = count;
				visit[nextx][nexty] = true;
			}
		}
		
		return c;
	}
}