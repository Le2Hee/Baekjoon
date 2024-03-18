import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		if (s.charAt(0) == '"' && s.charAt(s.length() - 1) == '"') {
			if (s.length() <= 2) {
				sb.append("CE");
			} else {
				sb.append(s.substring(1, s.length() - 1));
			}
		} else {
			sb.append("CE");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}