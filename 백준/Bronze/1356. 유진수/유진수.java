import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		char[] c = str.toCharArray();
		int rsum = 1;
		
		for (int i = 0; i < str.length() - 1; i++) {
			rsum *= c[i] - '0';
			int lsum = 1;
			for (int j = i + 1; j < str.length(); j++) {
				lsum *= c[j] - '0';
			}
			
			if (rsum == lsum) {
				sb.append("YES");
				break;
			}
		}
		
		if (sb.length() == 0) {
			sb.append("NO");
		}
		
		System.out.println(sb);
	}
}