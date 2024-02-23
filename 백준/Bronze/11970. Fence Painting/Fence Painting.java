import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int max = Math.max(Math.max(a, b), Math.max(c, d));
		boolean[] visit = new boolean[max + 1];
		
		for (int i = a + 1; i <= b; i++) {
			visit[i] = true;
		}
		
		for (int i = c + 1; i <= d; i++) {
			visit[i] = true;
		}
		
		int count = 0;
		for (int i = 0; i <= max; i++) {
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
