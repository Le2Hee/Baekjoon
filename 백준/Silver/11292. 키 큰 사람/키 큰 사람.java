import java.io.*;
import java.util.*;

public class Main {
	
	static class Member {
		String name;
		int height;
		
		public Member(String n, int h) {
			name = n;
			height = h;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String s = "";
		
		Member member;
		List<Member> list;
		StringTokenizer st;
		while (!(s = br.readLine()).equals("0")) {
			list = new LinkedList<>();
			int t = Integer.parseInt(s);
			
			while (t-- > 0) {
				st = new StringTokenizer(br.readLine());
				String n = st.nextToken();
				int h = (int)(Double.parseDouble(st.nextToken()) * 100);
				member = new Member(n, h);
				list.add(member);
			}
			
			Collections.sort(list, (o1, o2) -> o2.height - o1.height);
			
			int max = list.get(0).height;
			for (int i = 0; i < list.size(); i++) {
				if (max == list.get(i).height) {
					sb.append(list.get(i).name).append(" ");
				}
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}