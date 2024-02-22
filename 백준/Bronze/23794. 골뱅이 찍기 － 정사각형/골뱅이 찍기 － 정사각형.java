import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int len = n + 2;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i == 0 || i == len - 1) {
					sb.append("@");
				} else {
					if (j == 0 || j == len - 1) {
						sb.append("@");
					} else {
						sb.append(" ");
					}
				}
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
