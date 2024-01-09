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
			
			if (str.equals("anj")) {
				sb.append("뭐야;");
			}
		}
		
		if (sb.length() == 0) {
			sb.append("뭐야?");
		}
		
		System.out.println(sb);
	}
}