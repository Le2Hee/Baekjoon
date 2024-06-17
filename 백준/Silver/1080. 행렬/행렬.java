import java.io.*;
import java.util.*;

public class Main {
	
	static int h, w;
	static char[][] oned, oneu, two;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken()); // 행
		w = Integer.parseInt(st.nextToken()); // 열
		
		oned = new char[h][w];
		oneu = new char[h][w];
		two = new char[h][w];
		
		char[] arr;
		for (int i = 0; i < h; i++) {
			arr = br.readLine().toCharArray();
			
			for (int j = 0; j < w; j++) {
				oned[i][j] = arr[j];
				oneu[i][j] = arr[j];
			}
		}
		
		for (int i = 0; i < h; i++) {
			arr = br.readLine().toCharArray();
			
			for (int j = 0; j < w; j++) {
				two[i][j] = arr[j];
			}
		}
		
		int down = 0;
		int up = 0;
		
		// 위에서 아래로
		for (int i = 0; i <= h - 3; i++) {
			for (int j = 0; j <= w - 3; j++) {
				if (oned[i][j] != two[i][j]) {
					change(i, j, 1);
					down++;
				}
			}
		}
		
		// 아래에서 위로
		for (int i = h - 3; i >= 0; i--) {
			for (int j = w - 3; j >= 0; j--) {
				change(i, j, 2);
				up++;
			}
		}
		
		int count = 0;
		if (!check(1) && check(2)) {
			count = up;
		} else if (check(1) && !check(2)) {
			count = down;
		} else if (check(1) && check(2)) {
			count = Math.min(up, down);
		} else {
			count = -1;
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void change(int y, int x, int du) {
		if (du == 1) {
			for (int i = y; i < y + 3; i++) {
				for (int j = x; j < x + 3; j++) {
					if (oned[i][j] == '0') {
						oned[i][j] = '1';
					} else {
						oned[i][j] = '0';
					}
				}
			}
		} else {
			for (int i = y; i < y + 3; i++) {
				for (int j = x; j < x + 3; j++) {
					if (oneu[i][j] == '0') {
						oneu[i][j] = '1';
					} else {
						oneu[i][j] = '0';
					}
				}
			}
		}
	}
	
	private static boolean check(int du) {
		boolean ch = true;
		
		if (du == 1) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (oned[i][j] != two[i][j]) {
						ch = false;
						break;
					}
				}
				
				if (!ch) {
					break;
				}
			}
		} else {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (oneu[i][j] != two[i][j]) {
						ch = false;
						break;
					}
				}
				
				if (!ch) {
					break;
				}
			}
		}
		
		return ch;
	}
}
