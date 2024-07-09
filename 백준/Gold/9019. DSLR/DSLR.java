import java.io.*;
import java.util.*;

public class Main {
	
	static int end;
	static boolean[] visit;
	static String[] str;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
		
		int start;
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			
			visit = new boolean[10000];
			str = new String[10000];
			Arrays.fill(str, "");
			
			function(start);
			sb.append(str[end]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void function(int start) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(start);
		visit[qu.peek()] = true;
		
		int now, D, S, L, R;
		while (!qu.isEmpty()) {
			now = qu.poll();
			
			D = (now * 2) % 10000;
			S = now == 0 ? 9999 : now - 1;
			L = (now % 1000) * 10 + (now / 1000);
			R = (now % 10) * 1000 + (now / 10);
			
			if (!visit[D]) {
				qu.add(D);
				visit[D] = true;
				str[D] = str[now] + "D";
			}
			
			if (!visit[S]) {
				qu.add(S);
				visit[S] = true;
				str[S] = str[now] + "S";
			}
			
			if (!visit[L]) {
				qu.add(L);
				visit[L] = true;
				str[L] = str[now] + "L";
			}
			
			if (!visit[R]) {
				qu.add(R);
				visit[R] = true;
				str[R] = str[now] + "R";
			}
			
			if (visit[end]) {
				break;
			}
		}
	}
}