import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		long n, m;
		long max = 0;
		Map<Long, Long> map = new LinkedHashMap<>();
		while (t-- > 0) {
			n = Long.parseLong(br.readLine());
			
			if (map.containsKey(n)) {
				m = map.get(n);
				map.put(n, m + 1);
				max = Math.max(max, m + 1);
			} else {
				map.put(n, (long) 1);
				max = Math.max(max, 1);
			}
		}
		
		List<Map.Entry<Long, Long>> list = new LinkedList<>(map.entrySet());
		list.sort((o1, o2) -> {
			int val = o2.getValue().compareTo(o1.getValue());
			if (val == 0) {
				return o1.getKey().compareTo(o2.getKey());
			} else {
				return val;
			}
		});
		
		bw.write(Long.toString(list.get(0).getKey()));
		bw.flush();
		bw.close();
		br.close();
	}
}