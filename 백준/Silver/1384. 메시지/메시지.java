import java.io.*;
import java.util.*;

public class Main {
	
	public static class Member {
		String name;
		List<Integer> Nlist;
		
		public Member(String n, Queue<Integer> qu) {
			name = n;
			
			Nlist = new LinkedList<>();
			while (!qu.isEmpty()) {
				Nlist.add(qu.poll());
			}
		}
	}
	
	static int n;
	static List<Member> list;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 1;
		boolean check;
		String s, name;
		Queue<Integer> qu;
		StringTokenizer st;
		
		while (!(s = br.readLine()).equals("0")) {
			if (count > 1) {
				sb.append("\n");
			}
			
			sb.append("Group ").append(count++).append("\n");
			
			check = true;
			list = new LinkedList<>();
			n = Integer.parseInt(s);
			for (int i = 0; i < n; i++) {
				qu = new LinkedList<>();
				st = new StringTokenizer(br.readLine());
				name = st.nextToken();
				
				for (int j = 1; j < n; j++) {
					if (st.nextToken().equals("N")) {
						qu.add(j);
					}
				}
				
				list.add(new Member(name, qu));
			}
			
			for (int i = 0; i < n; i++) {
				if (list.get(i).Nlist.size() > 0) {
					check = false;
					find(i);
				}
			}
			
			if (check) {
				sb.append("Nobody was nasty\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void find(int index) {
		String name = list.get(index).name;
		int in;
		
		for (int i = 0; i < list.get(index).Nlist.size(); i++) {
			in = index - list.get(index).Nlist.get(i);
			
			if (in < 0) {
				in += n;
			}
			
			sb.append(list.get(in).name).append(" was nasty about ").append(name).append("\n");
		}
	}
}