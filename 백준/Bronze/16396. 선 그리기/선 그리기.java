import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		boolean[] visit = new boolean[10001];
		int max = 0;
		
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for (int i = a; i < b; i++) {
				visit[i] = true;
			}
			
			max = Math.max(max, b);
		}
		
		int count = 0;
		for (int i = 1; i <= max; i++) {
			if (visit[i]) {
				count++;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
