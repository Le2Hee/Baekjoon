import java.io.*;
import java.util.*;

public class Main {
	
	public static class Node implements Comparable<Node> {
		int end, price;
		
		public Node(int e, int p) {
			end = e;
			price = p;
		}
		
		@Override
		public int compareTo(Node o) {
			return price - o.price;
		}
	}
	
	static int n, m;
	static Map<Integer, List<Node>> map;
	static int[] dis;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine()); // 도시의 개수
		m = Integer.parseInt(br.readLine()); // 버스의 개수
		
		map = new LinkedHashMap<>();
		visit = new boolean[n + 1];
		
		dis = new int[n + 1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		StringTokenizer st;
		int start, end, price;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			price = Integer.parseInt(st.nextToken());
			
			if (!map.containsKey(start)) {
				map.put(start, new ArrayList<>());
			}
			
			map.get(start).add(new Node(end, price));
		}
		
		st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		
		function(start);
		bw.write(Integer.toString(dis[end]));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void function(int s) {
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.add(new Node(s, 0));
		dis[s] = 0;
		
		Node node;
		while (!q.isEmpty()) {
			node = q.poll();
			
			if (!visit[node.end]) {
				visit[node.end] = true;
				
				if (!map.containsKey(node.end)) {
					continue;
				}
				
				for (Node nd : map.get(node.end)) {
					if (!visit[nd.end] && dis[node.end] + nd.price < dis[nd.end]) {
						dis[nd.end] = dis[node.end] + nd.price;
						q.add(new Node(nd.end, dis[nd.end]));
					}
				}
			}
		}
	}
}