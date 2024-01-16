import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		if (m < 2) {
			sb.append("Before");
		} else if (m == 2) {
			if (d < 18) {
				sb.append("Before");
			} else if (d == 18) {
				sb.append("Special");
			} else {
				sb.append("After");
			}
		} else {
			sb.append("After");
		}
		
		System.out.println(sb);
	}
}