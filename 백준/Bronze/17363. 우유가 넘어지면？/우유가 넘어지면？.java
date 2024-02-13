import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[h][w];
		String s = "";
		
		for (int i = 0; i < h; i++) {
			s = br.readLine();
			for (int j = 0; j < w; j++) {
				map[i][j] = s.charAt(j); 
			}
		}
		
		for (int i = w - 1; i >= 0; i--) {
			for (int j = 0; j < h; j++) {
				if (map[j][i] == '-') {
					sb.append('|');
				} else if (map[j][i] == '|') {
					sb.append('-');
				} else if (map[j][i] == '/') {
					sb.append('\\');
				} else if (map[j][i] == '\\') {
					sb.append('/');
				} else if (map[j][i] == '^') {
					sb.append('<');
				} else if (map[j][i] == '<') {
					sb.append('v');
				} else if (map[j][i] == 'v') {
					sb.append('>');
				} else if (map[j][i] == '>') {
					sb.append('^');
				} else {
					sb.append(map[j][i]);
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}