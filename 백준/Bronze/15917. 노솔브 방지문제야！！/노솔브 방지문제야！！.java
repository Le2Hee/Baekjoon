import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int m = n * -1;
			
			if ((n & m) == n) {
				sb.append(1);
			} else {
				sb.append(0);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}