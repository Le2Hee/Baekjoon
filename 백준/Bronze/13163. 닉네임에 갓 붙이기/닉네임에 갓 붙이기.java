import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			List<String> name = new LinkedList<>();
			
			while (st.hasMoreElements()) {
				name.add(st.nextToken());
			}
			
			sb.append("god");
			
			for (int i = 1; i < name.size(); i++) {
				sb.append(name.get(i));
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
