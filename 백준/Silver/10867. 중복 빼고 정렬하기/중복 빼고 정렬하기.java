import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		TreeSet<Integer> ts = new TreeSet<>();
		while (t-- > 0) {
			ts.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int num : ts) {
			sb.append(num).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}