import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String w = st.nextToken(); // 방향
		int n = Integer.parseInt(st.nextToken()); // 배열의 크기
		
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		if (w.equals("U") || w.equals("D")) {
			for (int i = n - 1; i >= 0; i--) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] == 2) {
						sb.append(5);
					} else if (arr[i][j] == 5) {
						sb.append(2);
					} else if (arr[i][j] == 1) {
						sb.append(1);
					} else if (arr[i][j] == 8) {
						sb.append(8);
					} else {
						sb.append("?");
					}
					
					sb.append(" ");
				}
				
				sb.append("\n");
			}
			
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = n - 1; j >= 0; j--) {
					if (arr[i][j] == 2) {
						sb.append(5);
					} else if (arr[i][j] == 5) {
						sb.append(2);
					} else if (arr[i][j] == 1) {
						sb.append(1);
					} else if (arr[i][j] == 8) {
						sb.append(8);
					} else {
						sb.append("?");
					}
					
					sb.append(" ");
				}
				
				sb.append("\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}