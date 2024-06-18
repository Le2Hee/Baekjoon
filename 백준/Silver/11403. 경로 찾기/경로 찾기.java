import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 정점의 개수
		
		int[][] node = new int[n][n];
		int max = 1000000; // 무한
		
		int l;
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				l = Integer.parseInt(st.nextToken());
				
				if (l == 1) {
					node[i][j] = 1;
				} else {
					node[i][j] = max;
				}
			}
		}
		
		for (int k = 0; k < n; k++) { // 거쳐가는 정점
			for (int i = 0; i < n; i++) { // 출발 정점
				for (int j = 0; j < n; j++) { // 도착 정점
					node[i][j] = Math.min(node[i][j], node[i][k] + node[k][j]);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (node[i][j] >= max) { // 갈 수 없다면 0
					sb.append(0).append(" ");
				} else { // 갈 수 있다면 1
					sb.append(1).append(" ");
				}
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}