import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashSet<String> members = new LinkedHashSet();
		String str;
		
		for (int i = 0; i < m; i++) {
			str = br.readLine();
			members.remove(str);
			members.add(str);
		}
		
		List<Object> arr = Arrays.asList(members.toArray());
		
		for (int i = 0; i < n; i++) {
			if (i < members.size()) {
				sb.append(arr.get(i)).append("\n");
			} else {
				break;
			}
		}
		
		System.out.println(sb);
	}
}