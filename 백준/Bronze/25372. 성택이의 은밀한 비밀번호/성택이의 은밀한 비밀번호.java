import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String str;
		
		while (n-- > 0) {
			str = br.readLine();
			
			if (6 <= str.length() && str.length() <= 9) {
				sb.append("yes");
			} else {
				sb.append("no");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
