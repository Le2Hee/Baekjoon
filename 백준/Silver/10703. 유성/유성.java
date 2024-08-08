import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken()); // 세로
		int w = Integer.parseInt(st.nextToken()); // 가로
		
		char[][] grid = new char[h][w];
		
		char[] str;
		for (int i = 0; i < h; i++) {
			str = br.readLine().toCharArray();
			
			for (int j = 0; j < w; j++) {
				grid[i][j] = str[j];
			}
		}
		
		int min = Integer.MAX_VALUE;
		int meteor, land;
		for (int i = 0; i < w; i++) {
			meteor = -1;
			land = -1;
			
			for (int j = 0; j < h; j++) {
				if (grid[j][i] == 'X') {
					meteor = j;
				} else if (grid[j][i] == '#') {
					land = j;
					break;
				}
			}
			
			if (meteor == -1) {
				continue;
			}
			
			if (land == -1) {
				land = h - 1;
			}
			
			min = Math.min(min, land - meteor - 1);
		}
		
		for (int i = h - 1; i >= 0; i--) {
			for (int j = 0; j < w; j++) {
				if (grid[i][j] == 'X') {
					grid[i + min][j] = 'X';
					grid[i][j] = '.';
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				sb.append(grid[i][j]);
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}