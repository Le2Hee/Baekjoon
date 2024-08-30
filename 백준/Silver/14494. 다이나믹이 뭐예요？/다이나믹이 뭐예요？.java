import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int[][] numberCase = new int[y][x];
		
		for (int i = 0; i < y; i++) {
			numberCase[i][0] = 1;
		}
		
		for (int i = 0; i < x; i++) {
			numberCase[0][i] = 1;
		}
		
		int[] dx = {-1, 0, -1};
		int[] dy = {-1, -1, 0};
		
		for (int i = 1; i < y; i++) {
			for (int j = 1; j < x; j++) {
				for (int k = 0; k < 3; k++) {
					numberCase[i][j] += numberCase[i + dy[k]][j + dx[k]];
					
					if (numberCase[i][j] > 1000000007) {
						numberCase[i][j] %= 1000000007;
					}
				}
			}
		}
		
		int count = numberCase[y - 1][x - 1];
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}