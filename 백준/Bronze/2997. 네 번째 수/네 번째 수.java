import java.io.*;
import java.util.*;

public class Main {
	
	static int a, b, c;
	static List<Integer> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		
		for (int i = 0; ; i++) {
			list = new LinkedList<>();
			if (check(i)) {
				sb.append(i);
				break;
			}
		}
		
		System.out.println(sb);
	}
	
	private static boolean check(int n) {
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(n);
		
		Collections.sort(list);
		
		int m = list.get(1) - list.get(0);
		for (int i = 2; i < 4; i++) {
			if (list.get(i) - list.get(i - 1) != m) {
				return false;
			}
		}
		
		return true;
	}
}