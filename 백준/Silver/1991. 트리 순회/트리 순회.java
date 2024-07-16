import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] node;
	static StringBuilder sb = new StringBuilder();
	static StringBuilder sub = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		node = new int[27][2];
		
		int n, l, r;
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			n = st.nextToken().charAt(0) - 'A' + 1;
			l = st.nextToken().charAt(0) - 'A' + 1;
			r = st.nextToken().charAt(0) - 'A' + 1;
			
			node[n][0] = l;
			node[n][1] = r;
		}
		
		preorder();
		sb.append("\n");
		
		inorder();
		sb.append("\n");
		
		postorder();
		sb.append(sub.toString());
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 전위 순회
	private static void preorder() {
		Deque<Integer> rq = new LinkedList<>();
		Queue<Integer> lq = new LinkedList<>();
		lq.add(1);
		
		int now, l, r;
		while (!rq.isEmpty() || !lq.isEmpty()) {
			if (!lq.isEmpty()) {
				now = lq.poll();
			} else {
				now = rq.poll();
			}
			
			sb.append((char)(now + 'A' - 1));
			
			l = node[now][0];
			r = node[now][1];
			
			if (l > 0) {
				lq.add(l);
			}
			
			if (r > 0) {
				rq.addFirst(r);
			}
		}
	}
	
	// 중위 순회
	private static void inorder() {
		String result = null;
		StringBuilder s;
		Queue<Integer> lq = new LinkedList<>();
		Deque<Integer> rq = new LinkedList<>();
		lq.add(1);
		
		int now, l, r;
		while (!lq.isEmpty() || !rq.isEmpty()) {
			if (!lq.isEmpty()) {
				now = lq.poll();
			} else {
				now = rq.poll();
			}
			
			l = node[now][0];
			r = node[now][1];
			
			s = new StringBuilder();
			if (l > 0) {
				lq.add(l);
				s.append((char)(l + 'A' - 1)).append((char)(now + 'A' - 1));
			} else {
				s.append((char)(now + 'A' - 1));
			}
			
			if (r > 0) {
				rq.addFirst(r);
				s.append((char)(r + 'A' - 1));
			}
			
			if (result == null) {
				result = s.toString();
			} else {
				result = result.replaceAll(String.valueOf((char)(now + 'A' - 1)), s.toString());
			}
		}
		
		sb.append(result);
	}
	
	// 후위 순회
	private static void postorder() {
		StringBuilder post = new StringBuilder();
		Queue<Integer> rq = new LinkedList<>();
		Deque<Integer> lq = new LinkedList<>();
		rq.add(1);
		
		int now, l, r;
		while (!rq.isEmpty() || !lq.isEmpty()) {
			if (!rq.isEmpty()) {
				now = rq.poll();
			} else {
				now = lq.poll();
			}
			
			post.append((char)(now + 'A' - 1));
			
			l = node[now][0];
			r = node[now][1];
			
			if (l > 0) {
				lq.addFirst(l);
			}
			
			if (r > 0) {
				rq.add(r);
			}
		}
		
		sub.append(post.reverse());
	}
}