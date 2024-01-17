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
			
			for (int j = 1; j < 2 * i; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 1) {
						sb.append("*");
					} else {
						sb.append(" ");
					}
				} else if (i % 2 == 1) {
					if (j % 2 == 1) {
						sb.append("*");
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