import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		boolean check;
		StringTokenizer st;
		
		for (int cs = 1; cs <= t; cs++) {
			sb.append("Case " + cs + ": ");
			map = new int[9][9];
			
			if (cs > 1) {
				br.readLine();
			}
			
			for (int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine());
				
				for (int j = 0; j < 9; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			check = true;
			for (int i = 0; i < 9; i++) {
				if (!LRcheck(i)) {
					check = false;
					break;
				}
			}
			
			if (!check) {
				sb.append("INCORRECT\n");
				continue;
			} else {
				for (int i = 0; i <= 6; i += 3) {
					for (int j = 0; j <= 6; j += 3) {
						if (!TTcheck(i, j)) {
							check = false;
							break;
						}
						
						if (!check) {
							break;
						}
					}
				}
				
				if (!check) {
					sb.append("INCORRECT\n");
				} else {
					sb.append("CORRECT\n");
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean LRcheck(int index) {
		boolean[] check = new boolean[10];
		
		for (int i = 0; i < 9; i++) {
			if (check[map[index][i]]) {
				return false;
			} else {
				check[map[index][i]] = true;
			}
		}
		
		check = new boolean[10];
		for (int i = 0; i < 9; i++) {
			if (check[map[i][index]]) {
				return false;
			} else {
				check[map[i][index]] = true;
			}
		}
		
		return true;
	}
	
	private static boolean TTcheck(int y, int x) {
		boolean[] check = new boolean[10];
		
		for (int i = y; i < y + 3; i++) {
			for (int j = x; j < x + 3; j++) {
				if (check[map[i][j]]) {
					return false;
				} else {
					check[map[i][j]] = true;
				}
			}
		}
		
		return true;
	}
}