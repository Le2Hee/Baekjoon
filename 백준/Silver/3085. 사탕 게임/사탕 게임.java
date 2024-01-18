import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static char[][] map;
	static int max = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new char[n][n];
		String str;
		
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				char swap = map[i][j];
				map[i][j] = map[i][j + 1];
				map[i][j + 1] = swap;
				search();
				if (max == n) {
					break;
				}
				map[i][j + 1] = map[i][j];
				map[i][j] = swap;
			}
			
			if (max == n) {
				break;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				char swap = map[j][i];
				map[j][i] = map[j + 1][i];
				map[j + 1][i] = swap;
				search();
				if (max == n) {
					break;
				}
				map[j + 1][i] = map[j][i];
				map[j][i] = swap;
			}
			
			if (max == n) {
				break;
			}
		}
		
		System.out.println(max);
	}
	
	private static void search() {
		for (int i = 0; i < n; i++) {
			int count = 1;
			
			for (int j = 0; j < n - 1; j++) {
				if (map[i][j] == map[i][j + 1]) {
					count++;
				} else {
					count = 1;
				}
				max = Math.max(count, max);
			}
			
			if (max == n) {
				break;
			}
		}
		
		
		if (max == n) {
			return;
		}
		
		for (int i = 0; i < n; i++) {
			int count = 1;
			
			for (int j = 0; j < n - 1; j++) {
				if (map[j][i] == map[j + 1][i]) {
					count++;
				} else {
					count = 1;
				}
				max = Math.max(max, count);
			}
			
			if (max == n) {
				break;
			}
		}
	}
}