import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] b = new int[m][k];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < k; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int index = 0;
		int[][] result = new int[n][k];
		
		for (int i = 0; i < n; i++) {
			index = 0;
			
			for (int j = 0; j < m; j++) {
				result[i][index] += a[i][j] * b[j][index];
				
				if (index == k - 1 && j == m - 1) {
					sb.append(result[i][index]).append(" ");
					break;
				} else if (j == m - 1) {
					sb.append(result[i][index]).append(" ");
					index++;
					j = -1;
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}