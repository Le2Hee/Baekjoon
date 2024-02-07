import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		if (a == 8 || a == 9) {
			if (b == c) {
				if (d == 8 || d == 9) {
					sb.append("ignore");
				}
			}
		}
		
		if (sb.length() == 0) {
			sb.append("answer");
		}
		
		System.out.println(sb);
	}
}