import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				sb.append(" ");
			}
			
			if (i != n) {
				for (int j = 1; j < 2 * i; j++) {
					if (j == 1 || j == 2 * i - 1) {
						sb.append("*");
					} else {
						sb.append(" ");
					}
				}
			} else {
				for (int j = 0; j < i * 2 - 1; j++) {
					sb.append("*");
				}
			}
			
			
			sb.append("\n");
		}
		
		System.out.println(sb);
    }
}