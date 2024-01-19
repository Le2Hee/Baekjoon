import java.io.*;
import java.util.*;

public class Main {
	
	public static class Member {
		int star, circle, square, triangle;
		String name;
		
		public Member(int s, int c, int sq, int t, String name) {
			star = s;
			circle = c;
			square = sq;
			triangle = t;
			this.name = name;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Member a, b;
		
		while (n-- > 0) {
			a = new Member(0, 0, 0, 0, "A");
			b = new Member(0, 0, 0, 0, "B");
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			while (num-- > 0) {
				int m = Integer.parseInt(st.nextToken());
				if (m == 4) {
					a.star++;
				} else if (m == 3) {
					a.circle++;
				} else if (m == 2) {
					a.square++;
				} else {
					a.triangle++;
				}
			}
			
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			while (num-- > 0) {
				int m = Integer.parseInt(st.nextToken());
				if (m == 4) {
					b.star++;
				} else if (m == 3) {
					b.circle++;
				} else if (m == 2) {
					b.square++;
				} else {
					b.triangle++;
				}
			}
			
			if (a.star == b.star && a.circle == b.circle && a.square == b.square && a.triangle == b.triangle) {
				sb.append("D").append("\n");
				continue;
			}
			
			List<Member> list = new LinkedList<>();
			list.add(a);
			list.add(b);
			
			Collections.sort(list, new Comparator<Member>() {
				@Override
				public int compare(Member o1, Member o2) {
					if (o1.star - o2.star == 0) {
						if (o1.circle - o2.circle == 0) {
							if (o1.square - o2.square == 0) {
								return o1.triangle - o2.triangle;
							} else {
								return o1.square - o2.square;
							}
						} else {
							return o1.circle - o2.circle;
						}
					} else {
						return o1.star - o2.star;
					}
				}
			});
			
			sb.append(list.get(1).name).append("\n");
		}
		
		System.out.println(sb);
	}
}