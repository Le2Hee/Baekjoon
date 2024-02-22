import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int l = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for (int i = 0; i <= a; i++) {
			int sl = l + i;
			int sr = r + (a - i);
			sum = Math.max(sum, 2 * (int)Math.min(sl, sr));
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}