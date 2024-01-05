import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(br.readLine());
		
		if (c * r < k) {
			sb.append(0);
		} else {
			boolean[][] check = new boolean[r][c];
			
			int count = 0;
			int startr = r - 1;
			int startc = 0;
			boolean run = true;			
			
			while (run) {
				check[startr][startc] = true;
				count++;
				
				if (count == k) {
					sb.append(startc + 1).append(" ").append(r - startr);
					break;
				}
				
				if (startr > 0 && !check[startr - 1][startc]) {
					if (startc > 0 && check[startr - 1][startc - 1]) {
						startr--;
						continue;
					} else {
						if (startc == 0) {
							startr--;
							continue;
						}
					}
				}
				
				if (startc < c - 1 && !check[startr][startc + 1]) {
					startc++;
					continue;
				}
				
				if (startr < r - 1 && !check[startr + 1][startc]) {
					startr++;
					continue;
				}
				
				if (startc > 0 && !check[startr][startc - 1]) {
					startc--;
					continue;
				}
			}
		}
		
		System.out.println(sb);
	}
}