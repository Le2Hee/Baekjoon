import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		if (s.charAt(0) == '5' && s.charAt(1) == '5' && s.charAt(2) == '5') {
			sb.append("YES");
		} else {
			sb.append("NO");
		}
		
		System.out.println(sb);
	}
}