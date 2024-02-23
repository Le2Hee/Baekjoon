import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			sb.append(i).append(" ");
			
			if (i % 6 == 0) {
				sb.append("Go! ");
			}
		}
		
		if (n % 6 != 0) {
			sb.append("Go! ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}