import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int n;
		
		int[] count = new int[11];
		count[1] = 1;
		count[2] = 2;
		count[3] = 4;
		
		for (int i = 4; i < 11; i++) {
			count[i] = count[i - 3] + count[i - 2] + count[i - 1];
		}
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			sb.append(count[n]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}