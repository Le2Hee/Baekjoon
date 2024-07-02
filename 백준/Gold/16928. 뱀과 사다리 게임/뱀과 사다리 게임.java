import java.io.*;
import java.util.*;

public class Main {
	
	static int[] num;
	static int[] count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 사다리의 개수
		int m = Integer.parseInt(st.nextToken()); // 뱀의 개수
		
		num = new int[101];
		for (int i = 1; i < 101; i++) {
			num[i] = i;
		}
		
		int start, end;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			
			num[start] = end;
		}
		
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			
			num[start] = end;
		}
		
		count = new int[101];
		
		
		bw.write(Integer.toString(find()));
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int find() {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(1);
		count[1] = 0;
		
		int now, next;
		while (true) {
			now = qu.poll();
			
			for (int i = 1; i <= 6; i++) {
				next = now + i;
				
				if (next <= 100 && count[num[next]] == 0) {
					count[num[next]] = count[now] + 1;
					qu.add(num[next]);
				}
			}
			
			if (count[100] != 0) {
				return count[100];
			}
		}
	}
}