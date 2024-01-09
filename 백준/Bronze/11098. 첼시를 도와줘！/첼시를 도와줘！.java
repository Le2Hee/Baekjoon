import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st; 
		Map<Integer, String> map;
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int max = Integer.MIN_VALUE;
			map = new HashMap<Integer, String>();
			
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int price = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
				map.put(price, name);
				max = Math.max(max, price);
			}
			
			String name = map.get(max);
			sb.append(name).append("\n");
		}
		
		System.out.println(sb);
	}
}