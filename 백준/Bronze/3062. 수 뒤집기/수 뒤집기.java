import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			StringBuilder str = new StringBuilder(br.readLine());
			int a = Integer.parseInt(str.toString());
			int b = Integer.parseInt(str.reverse().toString());
			
			String sum = String.valueOf((a + b));
			int len = sum.length() / 2;
			boolean bo = true;
			
			for (int i = 0; i < len; i++) {
				if (sum.charAt(i) != sum.charAt(sum.length() - 1 - i)) {
					bo = !bo;
					break;
				}
			}
			
			if (bo) {
				sb.append("YES");
			} else {
				sb.append("NO");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}