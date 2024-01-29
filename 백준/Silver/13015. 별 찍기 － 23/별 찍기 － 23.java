import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n) {
					if (i == 0 || i == 2 * n - 2) {
						sb.append("*");
					} else {
						if (j == i) {
							sb.append("*");
						} else if (2 * n - i - 2 == j) {
							sb.append("*");
						} else {
							sb.append(" ");
						}
					}
				}
			}
			
			for (int j = 0; j < 2 * n - 3; j++) {
				if (i == 0 || i == 2 * n - 2) {
					sb.append(" ");
				} else {
					if (i - 1 == j) {
						sb.append("*");
					} else if (2 * n - i - 3 == j && i < n - 1) {
						sb.append("*");
					} else if ((2 * n - 5) / 2 - i + n == j && i > n - 1) {
						sb.append("*");
					} else {
						sb.append(" ");
					}
				}
			}
			
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == 2 * n - 2) {
					sb.append("*");
				} else {
					if (n - i - 1 == j && i < n) {
						sb.append("*");
						break;
					} if (i >= n && i - n + 1 == j) {
						sb.append("*");
						break;
					} else {
						sb.append(" ");
					}
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
