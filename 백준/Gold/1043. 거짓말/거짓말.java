import java.io.*;
import java.util.*;

public class Main {
	
	static Map<Integer, List<Integer>> map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 사람의 수
		int m = Integer.parseInt(st.nextToken()); // 파티의 수
		
		boolean[] visit = new boolean[n + 1];
		st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < num; i++) {
			visit[Integer.parseInt(st.nextToken())] = true;
		}
		
		map = new LinkedHashMap<>();
		for (int i = 1; i <= n; i++) {
			map.put(i, new LinkedList<>());
		}
		
		int[][] arr = new int[m][];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new int[Integer.parseInt(st.nextToken())];
			
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			
			inputMap(arr[i]);
		}
		
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			if (visit[i]) {
				q.add(i);
			}
		}
		
		while (!q.isEmpty()) {
			num = q.poll();
			
			for (int membernum : map.get(num)) {
				if (!visit[membernum]) {
					q.add(membernum);
					visit[membernum] = true;
				}
			}
		}
		
		boolean check;
		int count = 0;
		for (int[] party : arr) {
			check = true;
			
			for (int member : party) {
				if (visit[member]) {
					check = false;
					break;
				}
			}
			
			if (check) {
				count++;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void inputMap(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					map.get(arr[i]).add(arr[j]);
				}
			}
		}
	}
}