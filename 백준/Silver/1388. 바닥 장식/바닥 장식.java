import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 세로
		int m = Integer.parseInt(st.nextToken()); // 가로
		String[][] arr = new String[n][m];
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				arr[i][j] = str[j];
				
				if (i == 0 && j == 0) {
					count++;
				} else if (i == 0) {
					if (arr[i][j].equals("|")) {
						count++;
					} else if (arr[i][j].equals("-") && !arr[i][j - 1].equals("-")) {
						count++;
					}
				} else if (j == 0) {
					if (arr[i][j].equals("|") && !arr[i - 1][j].equals("|")) {
						count++;
					} else if (arr[i][j].equals("-")) {
						count++;
					}
				} else {
					if (arr[i][j].equals("|") && !arr[i - 1][j].equals("|")) {
						count++;
					} else if (arr[i][j].equals("-") && !arr[i][j - 1].equals("-")) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}