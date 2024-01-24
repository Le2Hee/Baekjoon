import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = timeformat(st.nextToken());
		int e = timeformat(st.nextToken());
		int q = timeformat(st.nextToken());
		int count = 0;
		String str = "";
		HashMap<String, Integer> list = new LinkedHashMap<>();
		
		while ((str = br.readLine()) != null) {
			st = new StringTokenizer(str);
			int t = timeformat(st.nextToken());
			String name = st.nextToken();
			
			if (t <= s) {
				list.put(name, 0);
			} else if (t >= e && t <= q) {
				if (list.get(name) != null && list.get(name) == 0) {
					count++;
					list.replace(name, 1);
				}
			}
		}
		
		System.out.println(count);
	}
	
	private static int timeformat(String t) {
		StringTokenizer st = new StringTokenizer(t, ":");
		int h = Integer.parseInt(st.nextToken()) * 60;
		int m = Integer.parseInt(st.nextToken());
		
		return h + m;
	}
}
