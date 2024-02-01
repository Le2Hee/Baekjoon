import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int count = 0;
			boolean[][] box = new boolean[h][w];
			
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					int num = Integer.parseInt(st.nextToken());
					if (num == 1) {
						box[i][j] = true;
					}
				}
			}
			
			for (int i = 0; i < h - 1; i++) {
				for (int j = 0; j < w; j++) {
					if (box[i][j]) {
						for (int k = i + 1; k < h; k++) {
							if (!box[k][j]) {
								count++;
							}
						}
					}
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}
}