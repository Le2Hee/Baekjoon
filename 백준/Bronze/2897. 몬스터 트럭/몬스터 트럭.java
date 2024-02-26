import java.io.*;
import java.util.*;

public class Main {
	
	static int h, w;
	static int[] dx = {0, 1, 0, 1};
	static int[] dy = {0, 0, 1, 1};
	static char[][] carpark;
	static int[] count = new int[5];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		carpark = new char[h][w];
		
		String s = "";
		for (int i = 0; i < h; i++) {
			s = br.readLine();
			for (int j = 0; j < w; j++) {
				carpark[i][j] = s.charAt(j);
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (carpark[i][j] != '#') {
					search(i, j);
				}
			}
		}
		
		for (int n : count) {
			sb.append(n).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void search(int y, int x) {
		int nowx = x;
		int nowy = y;
		
		int trueCount = 0;
		int carCount = 0;
		
		for (int i = 0; i < 4; i++) {
			int nextx = nowx + dx[i];
			int nexty = nowy + dy[i];
			
			if (check(nexty, nextx) && carpark[nexty][nextx] != '#') {
				trueCount++;
				
				if (carpark[nexty][nextx] == 'X') {
					carCount++;
				}
			} else {
				break;
			}
		}
		
		if (trueCount == 4) {
			count[carCount]++;
		}
	}
	
	private static boolean check(int y, int x) {
		return 0 <= y && 0 <= x && y < h && x < w;
	}
}