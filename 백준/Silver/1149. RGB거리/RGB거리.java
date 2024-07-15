import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		int[][] rgb = new int[t][3]; // RGB 저장 배열
		
		// 첫 번째 RGB
		StringTokenizer st = new StringTokenizer(br.readLine());
		rgb[0][0] = Integer.parseInt(st.nextToken());
		rgb[0][1] = Integer.parseInt(st.nextToken());
		rgb[0][2] = Integer.parseInt(st.nextToken());
		
		// 두 번째 부터 마지막 RGB
		int r, g, b;
		for (int i = 1; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken()); // 빨강
			g = Integer.parseInt(st.nextToken()); // 초록
			b = Integer.parseInt(st.nextToken()); // 파랑
			
			rgb[i][0] = Math.min(rgb[i - 1][1], rgb[i - 1][2]) + r;
			rgb[i][1] = Math.min(rgb[i - 1][0], rgb[i - 1][2]) + g;
			rgb[i][2] = Math.min(rgb[i - 1][1], rgb[i - 1][0]) + b;
		}
		
		int min = Math.min(rgb[t - 1][0], Math.min(rgb[t - 1][1], rgb[t - 1][2]));
		bw.write(Integer.toString(min));
		bw.flush();
		bw.close();
		br.close();
	}
}