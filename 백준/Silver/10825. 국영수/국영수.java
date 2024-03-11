import java.io.*;
import java.util.*;

public class Main {
	
	static public class Member {
		String name;
		int ko, en, ma;
		
		public Member(String n, int k, int e, int m) {
			name = n;
			ko = k;
			en = e;
			ma = m;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		List<Member> list = new LinkedList<>();
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			list.add(new Member(name, a, b, c));
		}
		
		Collections.sort(list, new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				if (o2.ko - o1.ko == 0) {
					if (o1.en - o2.en == 0) {
						if (o2.ma - o1.ma == 0) {
							if (o1.name.compareTo(o2.name) < 0) {
								return -1;
							} else {
								return 1;
							}
						} else {
							return o2.ma - o1.ma;
						}
					} else {
						return o1.en - o2.en;
					}
				} else {
					return o2.ko - o1.ko;
				}
			}
		});
		
		for (Member m : list) {
			sb.append(m.name).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}