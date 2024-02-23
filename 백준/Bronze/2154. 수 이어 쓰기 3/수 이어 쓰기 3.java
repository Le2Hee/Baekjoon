import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder s = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			s.append(i);
		}
		
		sb.append(s.toString().indexOf(String.valueOf(n)) + 1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
