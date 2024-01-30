import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		boolean[][] visit = new boolean[h][w];
		visit[0][0] = true;
		int nowx = 0;
		int nowy = 0;
		int index = 0;
		int result = 0;
		
		for (int i = 1; i < h * w; i++) {
			int x = nowx + dx[index];
			int y = nowy + dy[index];
			
			if (x < 0 || x >= w || y >= h || y < 0 || visit[y][x]) {
				result++;
				index++;
				if (index == 4) {
					index = 0;
				}
				nowx += dx[index];
				nowy += dy[index];
				visit[nowy][nowx] = true;
			} else {
				visit[y][x] = true;
				nowx = x;
				nowy = y;
			}
		}
		
		System.out.println(result);
	}
}