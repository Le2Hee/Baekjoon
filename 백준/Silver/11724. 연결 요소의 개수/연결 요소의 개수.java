import java.io.*;
import java.util.*;

public class Main {
	
	static int n, m;
	static boolean[] visit;
	static int[] start, end;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int count = 0;
		
		start = new int[m];
		end = new int[m ];
		visit = new boolean[n + 1];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			start[i] = u;
			end[i] = v;
		}
		
		for (int i = 1; i <= n; i++) {
			if (!visit[i]) {
				count++;
				search(i);
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void search(int n) {
		visit[n] = true;
		
		for (int i = 0; i < m; i++) {
			if (start[i] == n && !visit[end[i]]) {
				search(end[i]);
			}
			
			if (end[i] == n && !visit[start[i]]) {
				search(start[i]);
			}
		}
	}
}