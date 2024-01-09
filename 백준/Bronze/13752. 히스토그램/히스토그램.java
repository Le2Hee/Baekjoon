import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			int m = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < m; i++) {
				sb.append("=");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
