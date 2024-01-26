import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			String s = br.readLine();
			int[] num = new int[10];
			
			for (int i = 0; i < s.length(); i++) {
				num[s.charAt(i) - '0']++;
			}
			
			int count = 0;
			
			for (int m : num) {
				if (m != 0) {
					count++;
				}
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}
}