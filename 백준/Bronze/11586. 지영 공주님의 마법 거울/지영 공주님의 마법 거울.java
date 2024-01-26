import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		char[][] mirror = new char[n][n];
		String s = "";
		
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < n; j++) {
				mirror[i][j] = s.charAt(j);
			}
		}
		
		int choice = Integer.parseInt(br.readLine());
		
		if (choice == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sb.append(mirror[i][j]);
				}
				sb.append("\n");
			}
		} else if (choice == 2) {
			for (int i = 0; i < n; i++) {
				for (int j = n - 1; j >= 0; j--) {
					sb.append(mirror[i][j]);
				}
				sb.append("\n");
			}
		} else {
			for (int i = n - 1; i >= 0; i--) {
				for (int j = 0; j < n; j++) {
					sb.append(mirror[i][j]);
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
