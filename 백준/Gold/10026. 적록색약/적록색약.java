import java.io.*;
import java.util.*;

public class Main {
	
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	static int n;
	static char[][] map;
	static boolean[][] orivisit, rgvisit;
	
	public static void main(String[] args) throws IOException { // ○
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine()); // 크기
		
		map = new char[n][n];
		orivisit = new boolean[n][n];
		rgvisit = new boolean[n][n];
		
		char[] arr;
		for (int i = 0; i < n; i++) {
			arr = br.readLine().toCharArray();
			
			for (int j = 0; j < n; j++) {
				map[i][j] = arr[j];
			}
		}
		
		int oricount = 0, rgcount = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!orivisit[i][j]) {
					oricount++;
					ori(i, j);
				}
				
				if (!rgvisit[i][j]) {
					rgcount++;
					rg(i, j);
				}
			}
		}
		
		sb.append(oricount).append(" ").append(rgcount);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void rg(int y, int x) {
		Queue<Integer> yqu = new LinkedList<>();
		Queue<Integer> xqu = new LinkedList<>();
		yqu.add(y);
		xqu.add(x);
		rgvisit[y][x] = true;
		
		int nowy, nowx, nexty, nextx;
		while (!yqu.isEmpty()) {
			nowy = yqu.poll();
			nowx = xqu.poll();
			
			for (int i = 0; i < 4; i++) {
				nexty = nowy + dy[i];
				nextx = nowx + dx[i];
				
				if (check(nexty, nextx) && !rgvisit[nexty][nextx]) {
					if (((map[nowy][nowx] == 'R' || map[nowy][nowx] == 'G') && (map[nexty][nextx] == 'R' || map[nexty][nextx] == 'G')) || (map[nowy][nowx] == 'B' && map[nexty][nextx] == 'B')) {
						rgvisit[nexty][nextx] = true;
						yqu.add(nexty);
						xqu.add(nextx);
					}
				}
			}
		}
	}
	
	private static void ori(int y, int x) {
		Queue<Integer> yqu = new LinkedList<>();
		Queue<Integer> xqu = new LinkedList<>();
		yqu.add(y);
		xqu.add(x);
		orivisit[y][x] = true;
		
		int nowy, nowx, nexty, nextx;
		while (!yqu.isEmpty()) {
			nowy = yqu.poll();
			nowx = xqu.poll();
			
			for (int i = 0; i < 4; i++) {
				nexty = nowy + dy[i];
				nextx = nowx + dx[i];
				
				if (check(nexty, nextx) && !orivisit[nexty][nextx] && map[nexty][nextx] == map[nowy][nowx]) {
					orivisit[nexty][nextx] = true;
					yqu.add(nexty);
					xqu.add(nextx);
				}
			}
		}
	}
	
	private static boolean check(int y, int x) {
		return x >= 0 && y >= 0 && x < n && y < n;
	}
}
