import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	static boolean[] visit;
	static int[][] data;
	static int n, m, v;
	static Queue<Integer> qu = new LinkedList<Integer>();
	
	static class Node {
		int start;
		int end;
		
		public Node(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 점의 개수
		m = Integer.parseInt(st.nextToken()); // 간선 개수
		v = Integer.parseInt(st.nextToken()); // 시작 번호
		
		visit = new boolean[n + 1];
		data = new int[n + 1][n + 1];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int startNum = Integer.parseInt(st.nextToken());
			int endNum = Integer.parseInt(st.nextToken());
			data[startNum][endNum] = 1;
			data[endNum][startNum] = 1;
		}
		
		dfs(v);
		sb.append("\n");
		
		visit = new boolean[n + 1];
		bfs(v);
		
		System.out.println(sb);
	}
	
	private static void dfs(int startNum) {
		visit[startNum] = true;
		sb.append(startNum).append(" ");
		
		for (int i = 1; i <= n; i++) {
			if (data[startNum][i] == 1 && !visit[i]) {
				dfs(i);
			}
		}
	}
	
	private static void bfs(int startNum) {
		visit[startNum] = true;
		qu.add(startNum);
		
		while (!qu.isEmpty()) {
			startNum = qu.poll();
			sb.append(startNum).append(" ");
			
			for (int i = 1; i <= n; i++) {
				if(data[startNum][i] == 1 && !visit[i]) {
					qu.add(i);
					visit[i] = true;
				}
			}
		}
	}
}