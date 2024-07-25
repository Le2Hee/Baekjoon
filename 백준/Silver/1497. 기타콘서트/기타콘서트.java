import java.io.*;
import java.util.*;

public class Main {
	
	static int n, m, sum, min = 11, song = 0, songmin = 11;
	static boolean[][] arr;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 기타의 개수
		m = Integer.parseInt(st.nextToken()); // 곡의 개수
		
		arr = new boolean[n][m];
		visit = new boolean[n];
		
		char[] str;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextElement();
			str = st.nextToken().toCharArray();
			
			for (int j = 0; j < m; j++) {
				if (str[j] == 'Y') {
					arr[i][j] = true;
				}
			}
		}
		
		boolean[] vi = new boolean[m];
		bfs(vi, 0, -1);
		
		if (min == 11) {
			if (songmin == 11 || songmin == 0) {
				min = -1;
			} else {
				min = songmin;
			}
		}
		
		bw.write(Integer.toString(min));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void bfs(boolean[] vi, int count, int index) {
		if (check(vi)) {
			min = Math.min(min, count);
			return;
		} else {
			int num = numcheck(vi);
			
			if (song < num) {
				song = num;
				songmin = count;
			} else if (song == num && songmin > count) {
				songmin = count;
			}
		}
		
		for (int i = index + 1; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				for (int j = 0; j < m; j++) {
					if (arr[i][j]) {
						vi[j] = true;
					}
				}
				
				bfs(vi, count + 1, i);
				
				visit[i] = false;
				vi = beginCheck();
			}
		}
	}
	
	private static boolean[] beginCheck() {
		boolean[] result = new boolean[m];
		
		for (int i = 0; i < n; i++) {
			if (visit[i]) {
				for (int j = 0; j < m; j++) {
					if (arr[i][j]) {
						result[j] = true;
					}
				}
			}
		}
		
		return result;
	}
	
	private static int numcheck(boolean[] vi) {
		int num = 0;
		
		for (int i = 0; i < m; i++) {
			if (vi[i]) {
				num++;
			}
		}
		
		return num;
	}
	
	private static boolean check(boolean[] vi) {
		for (int i = 0; i < m; i++) {
			if (!vi[i]) {
				return false;
			}
		}
		
		return true;
	}
}