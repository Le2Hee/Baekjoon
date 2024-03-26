import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[h][w];
		boolean[][] visit = new boolean[h][w];
		char[] arr;
		for (int i = 0; i < h; i++) {
			arr = br.readLine().toCharArray();
			for (int j = 0; j < w; j++) {
				if (arr[j] == '.') {
					visit[i][j] = false;
					map[i][j] = -1;
				} else {
					visit[i][j] = true;
					map[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (!visit[i][j] && j > 0 && visit[i][j - 1]) {
					visit[i][j] = true;
					map[i][j] = map[i][j - 1] + 1;
				}
				
				sb.append(map[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}