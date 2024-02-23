import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int price = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int m = 1;
		for (int i = 0; i < n; i++) {
			m *= 10;
		}
		
		bw.write(String.valueOf(Math.round(price / (double)m) * m));
		bw.flush();
		bw.close();
		br.close();
	}
}
