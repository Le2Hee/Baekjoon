import java.io.*;
import java.util.*;

public class Main {
	
	public static class Member {
		int num, point;
		
		public Member(int n, int p) {
			num = n;
			point = p;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int n, sum, point;
		List<Member> list;
		
		while (t-- > 0) {
			list = new LinkedList<>();
			sum = 0;
			n = Integer.parseInt(br.readLine());
			
			for (int i = 1; i <= n; i++) {
				point = Integer.parseInt(br.readLine());
				list.add(new Member(i, point));
				sum += point;
			}
			
			Collections.sort(list, new Comparator<Member>() {
				@Override
				public int compare(Member o1, Member o2) {
					return o2.point - o1.point;
				}
			});
			
			if (list.get(0).point == list.get(1).point) {
				sb.append("no winner");
			} else {
				if (list.get(0).point <= sum / 2) {
					sb.append("minority winner ").append(list.get(0).num);
				} else {
					sb.append("majority winner ").append(list.get(0).num);
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}