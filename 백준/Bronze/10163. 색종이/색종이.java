import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] map = new int[1002][1002];
		int count = 0;
		int xmin = 1002;
		int xmax = -1;
		int ymin = 1002;
		int ymax = -1;
		
		while (n-- > 0) {
			count++;
			
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			xmin = Math.min(xmin, x);
			xmax = Math.max(x + r, xmax);
			ymin = Math.min(ymin, y);
			ymax = Math.max(ymax, y + h);
			
			for (int i = y; i < y + h; i++) {
				for (int j = x; j < x + r; j++) {
					map[i][j] = count;
				}
			}
		}
		
		int[] result = new int[count + 1];
		
		for (int i = ymin; i <= ymax; i++) {
			for (int j = xmin; j <= xmax; j++) {
				if (map[i][j] != 0) {
					result[map[i][j]]++;
				}
			}
		}
		
		for (int i = 1; i <= count; i++) {
			sb.append(result[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}