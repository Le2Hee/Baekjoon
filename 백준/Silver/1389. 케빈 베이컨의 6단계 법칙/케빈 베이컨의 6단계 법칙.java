import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 유저의 수
		int m = Integer.parseInt(st.nextToken()); // 친구 관계의 수
		
		int[][] node = new int[n + 1][n + 1];
		int max = 1000000;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					node[i][j] = 0;
				} else {
					node[i][j] = max;
				}
			}
		}
		
		int f1, f2;
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			f1 = Integer.parseInt(st.nextToken());
			f2 = Integer.parseInt(st.nextToken());
			
			node[f1][f2] = 1;
			node[f2][f1] = 1;
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					node[j][k] = Math.min(node[j][k], node[j][i] + node[i][k]);
				}
			}
		}
		
		int min = max, index = 0, sum;
		for (int i = 1; i <= n; i++) {
			sum = 0;
			
			for (int j = 1; j <= n; j++) {
				sum += node[i][j];
			}
			
			if (min > sum) {
				min = sum;
				index = i;
			}
		}
		
		bw.write(Integer.toString(index));
		bw.flush();
		bw.close();
		br.close();
	}
}
