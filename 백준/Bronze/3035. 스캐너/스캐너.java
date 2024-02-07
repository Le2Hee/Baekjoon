import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int zh = Integer.parseInt(st.nextToken());
		int zw = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[h][w * zw];
		
		for (int i = 0; i < h; i++) {
			String s = br.readLine();
			int index = 0;
			for (int j = 0; j < w * zw; j += zw) {
				for (int k = j; k < j + zw; k++) {
					map[i][k] = s.charAt(index);
				}
				index++;
			}
		}
		
		char[][] result = new char[h * zh][w * zw];
		
		for (int i = 0; i < w * zw; i++) {
			int index = 0;
			for (int j = 0; j < h * zh; j += zh) {
				for (int k = j; k < j + zh; k++) {
					result[k][i] = map[index][i];
				}
				index++;
			}
		}
		
		for (int i = 0; i < h * zh; i++) {
			for (int j = 0; j < w * zw; j++) {
				sb.append(result[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}