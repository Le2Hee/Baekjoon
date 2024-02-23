import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n * 4; i++) {
			for (int j = 0; j < n; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * 5; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}