import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			int num = Integer.parseInt(br.readLine());
			StringBuffer s = new StringBuffer(Integer.toBinaryString(num));
			s.reverse();
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					sb.append(i).append(" ");
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}