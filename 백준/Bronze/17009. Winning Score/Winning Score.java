import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a3 = Integer.parseInt(br.readLine());
		int a2 = Integer.parseInt(br.readLine());
		int a1 = Integer.parseInt(br.readLine());
		int b3 = Integer.parseInt(br.readLine());
		int b2 = Integer.parseInt(br.readLine());
		int b1 = Integer.parseInt(br.readLine());
		
		int a = a3 * 3 + a2 * 2 + a1;
		int b = b3 * 3 + b2 * 2 + b1;
		
		if (a > b) {
			sb.append("A");
		} else if (a == b) {
			sb.append("T");
		} else {
			sb.append("B");
		}
		
		System.out.println(sb);
	}
}