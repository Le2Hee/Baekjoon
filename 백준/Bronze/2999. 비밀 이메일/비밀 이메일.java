import java.io.*;
import java.util.*;

public class Main {
	
	static String s;
	static int w, h;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		s = br.readLine();
		w = 0;
		h = 0;
		
		lenSearch();
		char[][] map = new char[h][w];
		int index = 0;
		
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				map[j][i] = s.charAt(index++);
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				sb.append(map[i][j]);
			}
		}
		
		System.out.println(sb);
	}
	
	private static void lenSearch() {
		int len = s.length();
		
		for (int i = 1; i <= len; i++) {
			if (len % i == 0) {
				if (len / i < i) {
					break;
				} else {
					h = i;
					w = len / i;
				}
			}
		}
	}
}
