import java.io.*;
import java.util.*;

public class Main {
	
	static int[] dx = {1, -1, 0, 0, 1, -1, 1, -1};
	static int[] dy = {0, 0, -1, 1, 1, 1, -1, -1};
	static String[] key = {"R", "L", "B", "T", "RT", "LT", "RB", "LB"};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String king = st.nextToken();
		String stone = st.nextToken();
		int t = Integer.parseInt(st.nextToken());
		String s;
		
		int kingx = king.charAt(0) - 'A';
		int kingy = king.charAt(1) - '0';
		int stonex = stone.charAt(0) - 'A';
		int stoney = stone.charAt(1) - '0';
		
		while (t-- > 0) {
			s = br.readLine();
			int keyIndex = indexSearch(s);
			
			int kingNowX = kingx + dx[keyIndex];
			int kingNowY = kingy + dy[keyIndex];
			
			if (kingNowX == stonex && kingNowY == stoney) {
				int stoneNowX = stonex + dx[keyIndex];
				int stoneNowY = stoney + dy[keyIndex];
				
				if (check(kingNowX, kingNowY) && check(stoneNowX, stoneNowY)) {
					kingx = kingNowX;
					kingy = kingNowY;
					stonex = stoneNowX;
					stoney = stoneNowY;
				}
			} else if (check(kingNowX, kingNowY)) {
				kingx = kingNowX;
				kingy = kingNowY;
			}
		}
		
		sb.append((char)(kingx + 'A')).append(kingy).append("\n").append((char)(stonex + 'A')).append(stoney);
		System.out.println(sb);
	}
	
	private static int indexSearch(String s) {
		int index = -1;
		for (int i = 0; i < 8; i++) {
			if (key[i].equals(s)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	private static boolean check(int x, int y) {
		return x >= 0 && x < 8 && y > 0 && y <= 8;
	}
}