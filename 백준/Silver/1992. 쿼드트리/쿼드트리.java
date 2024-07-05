import java.io.*;
import java.util.*;

public class Main {
	
	static char[][] video;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 영상의 크기
		
		char[] arr;
		video = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			arr = br.readLine().toCharArray();
			
			for (int j = 0; j < n; j++) {
				video[i][j] = arr[j];
			}
		}
		
		function(0, n, 0, n);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void function(int starty, int endy, int startx, int endx) {
		Set<Character> set = new LinkedHashSet<>();
		char c = ' ';
		
		for (int i = starty; i < endy; i++) {
			for (int j = startx; j < endx; j++) {
				set.add(video[i][j]);
				c = video[i][j];
				
				if (set.size() > 1) {
					break;
				}
			}
			
			if (set.size() > 1) {
				break;
			}
		}
		
		if (set.size() == 1) {
			sb.append(c);
			return;
		}
		
		if (endy - starty == 2) {
			Queue<Character> qu = new LinkedList<>();
			set = new LinkedHashSet<>();
			
			for (int i = starty; i < endy; i++) {
				for (int j = startx; j < endx; j++) {
					qu.add(video[i][j]);
					set.add(video[i][j]);
				}
			}
			
			if (set.size() == 1) {
				sb.append(qu.poll());
			} else {
				sb.append("(");
				
				while (!qu.isEmpty()) {
					sb.append(qu.poll());
				}
				
				sb.append(")");
			}
		} else {
			sb.append("(");
			
			function(starty, endy - (endy - starty) / 2, startx, endx - (endx - startx) / 2);
			function(starty, endy - (endy - starty) / 2, startx + (endx - startx) / 2, endx);
			function(endy + (starty - endy) / 2, endy, startx, endx - (endx - startx) / 2);
			function(endy + (starty - endy) / 2, endy, startx + (endx - startx) / 2, endx);
			
			sb.append(")");
		}
	}
}