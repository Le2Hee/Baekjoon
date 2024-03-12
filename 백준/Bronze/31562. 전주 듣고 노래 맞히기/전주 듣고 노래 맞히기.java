import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, String> map = new LinkedHashMap<>();
		StringBuilder r;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			String name = st.nextToken();
			r = new StringBuilder();
			r.append(st.nextToken()).append(st.nextToken()).append(st.nextToken());
			
			if (map.containsKey(r.toString())) {
				map.put(r.toString(), "?");
			} else {
				map.put(r.toString(), name);
			}
		}
		
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			r = new StringBuilder();
			
			while (st.hasMoreElements()) {
				r.append(st.nextToken());
			}
			
			if (map.containsKey(r.toString())) {
				sb.append(map.get(r.toString()));
			} else {
				sb.append("!");
			}
			
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
