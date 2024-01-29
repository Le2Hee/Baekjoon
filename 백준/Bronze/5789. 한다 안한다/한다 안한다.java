import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			String str = br.readLine();
			
			if (str.charAt(str.length() / 2) == str.charAt(str.length() / 2 - 1)) {
				sb.append("Do-it").append("\n");
			} else {
				sb.append("Do-it-Not").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
