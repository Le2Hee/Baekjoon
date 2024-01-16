import java.io.*;
import java.util.*;

public class Main {
	
	public static class Member implements Comparable<Member> {
		String name;
		int d;
		int m;
		int y;
		
		public Member(String n, int d, int m, int y) {
			name = n;
			this.d = d;
			this.m = m;
			this.y = y;
		}

		@Override
		public int compareTo(Member o) {
			int n = 0;
			
			if (this.y - o.y < 0) {
				n = -1;
			} else if (this.y - o.y == 0) {
				if (this.m - o.m < 0) {
					n = -1;
				} else if (this.m - o.m == 0) {
					if (this.d - o.d < 0) {
						n = -1;
					} else if (this.d - o.d > 0) {
						n = 1;
					}
				} else {
					n = 1;
				}
			} else {
				n = 1;
			}
			
			return n;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		List<Member> list = new LinkedList<>();
		StringTokenizer st;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int d = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			Member member = new Member(name, d, m, y);
			list.add(member);
		}
		
		Collections.sort(list);
		
		sb.append(list.get(list.size() - 1).name).append("\n").append(list.get(0).name);
		System.out.println(sb);
	}
}
