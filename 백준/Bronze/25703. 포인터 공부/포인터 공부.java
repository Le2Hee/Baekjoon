import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		sb.append("int a;\n");
		
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				sb.append("int ").append(stars(i)).append("ptr = &a;");
			} else if (i == 2) {
				sb.append("int ").append(stars(i)).append("ptr").append(i).append(" = &ptr;");
			} else {
				sb.append("int ").append(stars(i)).append("ptr").append(i).append(" = &ptr").append(i - 1).append(";");
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static String stars(int n) {
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			s.append("*");
		}
		
		return s.toString();
	}
}