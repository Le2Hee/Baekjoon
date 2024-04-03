import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int g = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		String name, pe;
		int n;
		List<String> l;
		Map<String, List<String>> map = new LinkedHashMap<>();
		Map<String, String> kPe = new LinkedHashMap<>();
		while (g-- > 0) {
			name = br.readLine();
			n = Integer.parseInt(br.readLine());
			l = new LinkedList<>();
			
			while (n-- > 0) {
				pe = br.readLine();
				l.add(pe);
				kPe.put(pe, name);
			}
			
			map.put(name, l);
		}
		
		while (p-- > 0) {
			name = br.readLine();
			n = Integer.parseInt(br.readLine());
			
			switch (n) {
			case 1:
				sb.append(kPe.get(name)).append("\n");
				break;
			case 0:
				l = new LinkedList<>(map.get(name));
				Collections.sort(l);
				
				for (int i = 0; i < l.size(); i++) {
					sb.append(l.get(i)).append("\n");
				}
				
				break;
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}