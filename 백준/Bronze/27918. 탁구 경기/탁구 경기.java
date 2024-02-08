import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int d = 0;
		int p = 0;
		
		while (t-- > 0) {
			char c = br.readLine().charAt(0);
			
			if (c == 'D') {
				d++;
			} else {
				p++;
			}
			
			if (Math.abs(d - p) == 2) {
				break;
			}
		}
		
		sb.append(d).append(":").append(p);
		System.out.println(sb);
	}
}