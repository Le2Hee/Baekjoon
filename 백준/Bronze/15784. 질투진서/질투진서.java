import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken()) - 1;
		int w = Integer.parseInt(st.nextToken()) - 1;
		
		int[][] map = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int jin = map[h][w];
		for (int i = 0; i < n; i++) {
			if (map[h][i] > jin) {
				sb.append("ANGRY");
				break;
			}
			
			if (map[i][w] > jin) {
				sb.append("ANGRY");
				break;
			}
		}
		
		bw.write(sb.length() == 0 ? "HAPPY" : sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}