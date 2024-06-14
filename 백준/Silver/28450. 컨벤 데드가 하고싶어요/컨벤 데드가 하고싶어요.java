import java.io.*;
import java.util.*;

public class Main {
	
	static int h, w;
	static long[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken()); // 지도의 세로 크기
		w = Integer.parseInt(st.nextToken()); // 지도의 가로 크기
		
		map = new long[h][w]; // 지도
		
		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < w; j++) {
				map[i][j] = Long.parseLong(st.nextToken());
			}
		}
		
		int hide = Integer.parseInt(br.readLine()); // 재현이의 은신력
		first();
		
		long min;
		for (int i = 1; i < h; i++) {
			for (int j = 1; j < w; j++) {
				min = Math.min(map[i - 1][j], map[i][j - 1]); // 위, 왼쪽으로 오기 때문에 둘 중에 더 작은 값을 더 해준다.
				map[i][j] += min;
			}
		}
		
		if (map[h - 1][w - 1] > hide) { // 재현이의 은신력보다 눈치력이 높다면
			sb.append("NO");
		} else { // 재현이의 은신력이 더 높다면
			sb.append("YES\n").append(map[h - 1][w - 1]);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 위, 아래로 밖에 못 움직이기 때문에 h가 0이거나 w가 0일때는 한 쪽으로만 올 수 있다. 
	private static void first() {
		for (int i = 1; i < w; i++) {
			map[0][i] = map[0][i - 1] + map[0][i];
		}
		
		for (int i = 1; i < h; i++) {
			map[i][0] = map[i - 1][0] + map[i][0];
		}
	}
}
