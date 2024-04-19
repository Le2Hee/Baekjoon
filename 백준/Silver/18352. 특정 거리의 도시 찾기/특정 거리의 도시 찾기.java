import java.io.*;
import java.util.*;

public class Main {

	static List<Integer>[] list;
	static int n, m, k, start;
	static int[] count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		list = new LinkedList[n + 1];
		count = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			count[i] = -1;
			list[i] = new LinkedList<>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			list[s].add(e);
		}
		
		search(start);
		
		for (int i = 1; i <= n; i++) {
			if (count[i] == k) {
				sb.append(i).append("\n");
			}
		}

		bw.write(sb.length() == 0 ? "-1" : sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void search(int s) {
		Queue<Integer> qu = new LinkedList<>();
		count[s] = 0;
		qu.add(s);
		
		while (!qu.isEmpty()) {
			int a = qu.poll();
			
			for (int num : list[a]) {
				if (count[num] == -1) {
					count[num] = count[a] + 1;
					qu.add(num);
				}
			}
		}
	}
}