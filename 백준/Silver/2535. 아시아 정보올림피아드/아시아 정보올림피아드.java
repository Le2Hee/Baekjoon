import java.io.*;
import java.util.*;

public class Main {
	
	public static class Member {
		int country, number, score;
		
		public Member(int c, int n, int s) {
			country = c;
			number = n;
			score = s;
		}
	}
	
	static int[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		List<Member> list = new LinkedList<>();
		Member m;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			m = new Member(c, n, s);
			list.add(m);
		}
		
		Collections.sort(list, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o2.score - o1.score;
			}
		});
		
		visit = new int[101];
		visit[list.get(0).country]++;
		visit[list.get(1).country]++;
		
		sb.append(list.get(0).country).append(" ").append(list.get(0).number).append("\n");
		sb.append(list.get(1).country).append(" ").append(list.get(1).number).append("\n");
		sb.append(search(list)[0]).append(" ").append(search(list)[1]);
		System.out.println(sb);
	}
	
	private static int[] search(List<Member> list) {
		int[] result = new int[2];
		
		for (int i = 2; i < list.size(); i++) {
			if (visit[list.get(i).country] != 2) {
				result[0] = list.get(i).country;
				result[1] = list.get(i).number;
				break;
			}
		}
		
		return result;
	}
}