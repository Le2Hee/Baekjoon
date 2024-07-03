import java.io.*;
import java.util.*;

public class Main {
	
	static int[] dx = {0, 1, 0, -1, 0, 0};
	static int[] dy = {-1, 0, 1, 0, 0, 0};
	static int[] dh = {0, 0, 0, 0, 1, -1};
	static int n, m, h;
	static int[][][] field;
	static boolean[][][] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 열
		m = Integer.parseInt(st.nextToken()); // 행
		h = Integer.parseInt(st.nextToken()); // 높이
		
		
		field = new int[h][m][n];
		visit = new boolean[h][m][n];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < m; j++) {
				st = new StringTokenizer(br.readLine());
				
				for (int k = 0; k < n; k++) {
					field[i][j][k] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {
					if (field[i][j][k] == 1) {
						function(i, j, k);
					}
				}
			}
		}
		
		int count = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < n; k++) {
					if (field[i][j][k] == 0) {
						count = -1;
						break;
					} else {
						count = Math.max(count, field[i][j][k] - 1);
					}
				}
				
				if (count == -1) {
					break;
				}
			}
			
			if (count == -1) {
				break;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void function(int hi, int y, int x) {
		Queue<Integer> hq = new LinkedList<>();
		Queue<Integer> yq = new LinkedList<>();
		Queue<Integer> xq = new LinkedList<>();
		hq.add(hi);
		yq.add(y);
		xq.add(x);
		
		int nowh, nowy, nowx, nexth, nexty, nextx;
		while (!hq.isEmpty()) {
			nowh = hq.poll();
			nowy = yq.poll();
			nowx = xq.poll();
			
			for (int i = 0; i < 6; i++) {
				nexth = nowh + dh[i];
				nexty = nowy + dy[i];
				nextx = nowx + dx[i];
				
				if (check(nexth, nexty, nextx) && field[nexth][nexty][nextx] == 0) {
					field[nexth][nexty][nextx] = field[nowh][nowy][nowx] + 1;
					hq.add(nexth);
					yq.add(nexty);
					xq.add(nextx);
				} else if (check(nexth, nexty, nextx) && field[nexth][nexty][nextx] > field[nowh][nowy][nowx] + 1) {
					field[nexth][nexty][nextx] = field[nowh][nowy][nowx] + 1;
					hq.add(nexth);
					yq.add(nexty);
					xq.add(nextx);
				}
			}
		}
	}
	
	private static boolean check(int hi, int y, int x) {
		return hi >= 0 && y >= 0 && x >= 0 && hi < h && y < m && x < n;
	}
}