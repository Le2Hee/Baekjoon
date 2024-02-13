import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int m = 5 * n - 400;
		
		sb.append(m).append("\n");
		
		if (n > m) {
			sb.append(1);
		} else if (n == m) {
			sb.append(0);
		} else {
			sb.append(-1);
		}
		
		System.out.println(sb);
	}
}