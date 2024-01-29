import java.io.*;
import java.util.*;

public class Main {
	
	public static class Member {
		int a, b, c;
		
		public Member(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Member m;
		List<Member> list = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			m = new Member(a, b, c);
			list.add(m);
		}
		
		int[] result = new int[n];
		int[] f = new int[101];
		int[] s = new int[101];
		int[] t = new int[101];
		
		for (int i = 0; i < n; i++) {
			f[list.get(i).a]++;
			s[list.get(i).b]++;
			t[list.get(i).c]++;
		}
		
		for (int i = 0; i < n; i++) {
			if (f[list.get(i).a] == 1) {
				result[i] += list.get(i).a;
			}
			
			if (s[list.get(i).b] == 1) {
				result[i] += list.get(i).b;
			}
			
			if (t[list.get(i).c] == 1) {
				result[i] += list.get(i).c;
			}
		}
		
		for (int num : result) {
			sb.append(num).append("\n");
		}
		
		System.out.println(sb);
	}
}