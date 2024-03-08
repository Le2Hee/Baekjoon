import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static List<Deque<String>> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		
		list = new LinkedList<>();
		StringTokenizer st;
		Deque<String> de;
		for (int i = 0; i < n; i++) {
			de = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreElements()) {
				de.addLast(st.nextToken());
			}
			
			list.add(de);
		}
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreElements()) {
			String s = st.nextToken();
			
			if (!check(s)) {
				sb.append("Impossible");
				break;
			}
		}
		
		if (sb.length() == 0) {
			for (int i = 0; i < n; i++) {
				if (list.get(i).size() > 0) {
					sb.append("Impossible");
					break;
				}
			}
		}
		
		bw.write(sb.length() == 0 ? "Possible" : sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean check(String s) {
		boolean result = false;
		
		for (int i = 0; i < n; i++) {
			if (list.get(i).size() != 0) {
				String str = list.get(i).peekFirst();
				
				if (str.equals(s)) {
					result = true;
					list.get(i).pollFirst();
					break;
				}
			}
		}
		
		return result;
	}
}