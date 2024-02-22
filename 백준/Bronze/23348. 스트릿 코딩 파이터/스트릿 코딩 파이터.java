import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int test = Integer.parseInt(br.readLine());
		int sum = 0;
		
		while (test-- > 0) {
			int f = 0;
			int s = 0;
			int t = 0;
			
			for (int i = 0; i < 3; i++) {
				st = new StringTokenizer(br.readLine());
				f += Integer.parseInt(st.nextToken());
				s += Integer.parseInt(st.nextToken());
				t += Integer.parseInt(st.nextToken());
			}
			
			sum = Math.max(sum, (a * f) + (b * s) + (c * t));
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}
