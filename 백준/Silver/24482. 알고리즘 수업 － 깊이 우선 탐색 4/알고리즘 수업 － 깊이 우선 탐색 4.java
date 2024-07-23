import java.io.*;
import java.util.*;

public class Main { // 24482
	
	static int[] depth;
	static ArrayList<ArrayList<Integer>> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 정점의 개수
		int m = Integer.parseInt(st.nextToken()); // 간선의 개수
		int r = Integer.parseInt(st.nextToken()); // 시작 정점
		
		depth = new int[n + 1];
		list = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
			depth[i] = -1;
		}
		
		int start, end;
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			
			list.get(start).add(end);
			list.get(end).add(start);
		}
		
		// 내림차순 정렬
		list.forEach((x -> Collections.sort(x, Collections.reverseOrder())));
		
		dfs(r, 0);
		for (int i = 1; i <= n; i++) {
			sb.append(depth[i]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void dfs(int index, int count) {
		depth[index] = count;
		
		for (int i : list.get(index)) {
			if (depth[i] == -1) {
				dfs(i, count + 1);
			}
		}
	}
}