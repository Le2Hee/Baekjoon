import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[][] map = new boolean[101][101];
		int n = 4;
		StringTokenizer st;
		int count = 0;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for (int i = y1; i < y2; i++) {
				for (int j = x1; j < x2; j++) {
					map[i][j] = true;
				}
			}
		}
		
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 100; j++) {
				if (map[i][j]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}