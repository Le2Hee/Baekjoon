import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int alen = Integer.parseInt(st.nextToken());
		int blen = Integer.parseInt(st.nextToken());
		
		int n;
		TreeSet<Integer> ts = new TreeSet<>();
		st = new StringTokenizer(br.readLine());
		while (alen-- > 0) {
			n = Integer.parseInt(st.nextToken());
			ts.add(n);
		}
		
		st = new StringTokenizer(br.readLine());
		while (blen-- > 0) {
			n = Integer.parseInt(st.nextToken());
			ts.remove(n);
		}
		
		sb.append(ts.size()).append("\n");
		for (int num : ts) {
			sb.append(num).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}