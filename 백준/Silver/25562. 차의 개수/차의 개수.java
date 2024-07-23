import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		sb.append(n * (n - 1) / 2).append("\n");
		int num = 1;
		
		for (int i = 0; i < n; i++) {
			sb.append(num).append(" ");
			num *= 2;
		}
		
		sb.append("\n").append(n - 1).append("\n");
		num = 1;
		
		for (int i = 0; i < n; i++) {
			sb.append(num).append(" ");
			num++;
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}