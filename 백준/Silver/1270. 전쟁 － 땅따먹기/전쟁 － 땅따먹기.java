import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		Map<Long, Long> map;
		StringTokenizer st;
		boolean check;
		while (t-- > 0) {
			map = new LinkedHashMap<>();
			check = false;
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			while (st.hasMoreElements()) {
				long m = Long.parseLong(st.nextToken());
				
				if (map.containsKey(m)) {
					map.put(m, map.get(m) + 1);
					
					if (map.get(m) > n / 2) {
						check = true;
						sb.append(m).append("\n");
						break;
					}
				} else {
					map.put(m, (long) 1);
				}
			}
			
			if (!check) {
				sb.append("SYJKGW\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}