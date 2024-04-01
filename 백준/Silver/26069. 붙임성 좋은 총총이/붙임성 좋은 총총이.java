import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		String a, b;
		StringTokenizer st;
		Set<String> set = new LinkedHashSet<>();
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			a = st.nextToken();
			b = st.nextToken();
			
			if (a.equals("ChongChong")) {
				set.add(a);
			}
			
			if (b.equals("ChongChong")) {
				set.add(b);
			}
			
			if (set.contains(a)) {
				set.add(b);
			}
			
			if (set.contains(b)) {
				set.add(a);
			}
		}
		
		bw.write(Integer.toString(set.size()));
		bw.flush();
		bw.close();
		br.close();
	}
}