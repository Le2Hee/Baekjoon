import java.io.*;
import java.util.*;

public class Main {
	
	static int[] fdx = {0, 1, 0, -1}; // 북, 동, 남, 서
	static int[] fdy = {1, 0, -1, 0};
	static int[] bdx = {0, -1, 0, 1};
	static int[] bdy = {-1, 0, 1, 0};
	static boolean[] way;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		String s = "";
		
		
		while (t-- > 0) {
			way = new boolean[4];
			way[0] = true;
			
			s = br.readLine();
			int x = 0;
			int y = 0;
			int minx = 0;
			int maxx = 0;
			int miny = 0;
			int maxy = 0;
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'F') {
					x += fdx[waySearch()];
					y += fdy[waySearch()];
				} else if (s.charAt(i) == 'B') {
					x += bdx[waySearch()];
					y += bdy[waySearch()];
				} else if (s.charAt(i) == 'R') {
					int index = waySearch();
					way[index] = false;
					
					if (index + 1 == 4) {
						way[0] = true;
					} else {
						way[index + 1] = true;
					}
				} else {
					int index = waySearch();
					
					way[index] = false;
					
					if (index - 1 == -1) {
						way[3] = true;
					} else {
						way[index - 1] = true;
					}
				}
				
				minx = Math.min(minx, x);
				miny = Math.min(miny, y);
				maxx = Math.max(maxx, x);
				maxy = Math.max(maxy, y);
			}
			
			int result = Math.abs(maxx - minx) * Math.abs(maxy - miny);
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int waySearch() {
		int result = 0;
		
		for (int i = 0; i < 4; i++) {
			if (way[i]) {
				result = i;
				break;
			}
		}
		
		return result;
	}
}
