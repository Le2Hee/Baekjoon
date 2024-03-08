import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		int n = 0;
		
		for (int i = 0; i < 4; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		n = Integer.parseInt(st.nextToken()) * 4;
		
		if (sum >= n) {
			sb.append(0);
		} else {
			sb.append(n - sum);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}