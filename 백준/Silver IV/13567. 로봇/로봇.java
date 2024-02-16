import java.io.*;
import java.util.*;

public class Main {
	
	static int len;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int dir = 0; // 동, 북, 서, 남
	static int x = 0, y = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		len = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			char c = st.nextToken().charAt(0);
			int n = Integer.parseInt(st.nextToken());
			
			if (c == 'M') {
				while (n-- > 0) {
					x += dx[dir];
					y += dy[dir];
				}
			} else if (n == 0) {
				dir++;
				
				if (dir == 4) {
					dir = 0;
				}
			} else {
				dir--;
				
				if (dir == -1) {
					dir = 3;
				}
			}
			
			if (!check(x, y)) {
				sb.append(-1);
				break;
			}
		}
		
		bw.write(sb.length() == 0 ? sb.append(x).append(" ").append(y).toString() : sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
	
	private static boolean check (int x, int y) {
		return x >= 0 && y >= 0 && x < len && y < len;
	}
}