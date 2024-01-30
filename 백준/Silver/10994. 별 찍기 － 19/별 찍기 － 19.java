import java.io.*;
import java.util.*;

public class Main {
	
	static int h, w;
	static String[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()) - 1;
		map = new String[1][1];
		map[0][0] = "*";
		h = 1;
		w = 1;
		
		while (n-- > 0) { 
			setMap();
		}
			
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				sb.append(map[i][j]);
			}
			sb.append("\n");
		}
		
		
		System.out.println(sb);
	}
	
	private static void setMap() {
		h += 4;
		w += 4;
		String[][] sub = new String[h][w];
		
		for (int i = 2; i < h - 2; i++) {
			for (int j = 2; j < w - 2; j++) {
				sub[i][j] = map[i - 2][j - 2];
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (sub[i][j] == null) {
					if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
						sub[i][j] = "*";
					} else {
						sub[i][j] = " ";
					}
				}
			}
		}
		
		map = new String[h][w];
		map = sub;
	}
}