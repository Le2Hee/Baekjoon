import java.io.*;
import java.util.*;

public class Main {
	
	static int n, wc, bc;
	static int[][] paper;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		paper = new int[n][n];
		wc = 0;
		bc = 0;
		StringTokenizer st;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		func(0, n, 0, n);
		sb.append(wc).append("\n").append(bc);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void func(int startx, int endx, int starty, int endy) {
		boolean check = true;
		int num = paper[starty][startx];
		
		for (int i = starty; i < endy; i++) {
			for (int j = startx; j < endx; j++) {
				if (num != paper[i][j]) {
					check = false;
					break;
				}
			}
		}
		
		if (check) {
			if (num == 1) {
				bc++;
			} else {
				wc++;
			}
		} else {
			func(startx, (startx + endx) / 2, starty, (starty + endy) / 2);
			func((startx + endx) / 2, endx, starty, (starty + endy) / 2);
			func(startx, (startx + endx) / 2, (starty + endy) / 2, endy);
			func((startx + endx) / 2, endx, (starty + endy) / 2, endy);
		}
	}
}