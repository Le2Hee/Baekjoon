import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int count = str.length() / 2;
		int r = 0;
		int l = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (i < count) {
				l += str.charAt(i);
			} else {
				r += str.charAt(i);
			}
		}
		
		if (l == r) {
			sb.append("LUCKY");
		} else {
			sb.append("READY");
		}
		
		System.out.println(sb);
	}
}