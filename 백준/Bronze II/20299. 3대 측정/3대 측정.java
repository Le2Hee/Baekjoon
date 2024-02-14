import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int team = Integer.parseInt(st.nextToken());
		int indi = Integer.parseInt(st.nextToken());
		int count = 0;
		List<Integer> list = new LinkedList<>();
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int sum = a + b + c;
			
			if (sum >= team) {
				if (a >= indi && b >= indi && c >= indi) {
					count++;
					list.add(a);
					list.add(b);
					list.add(c);
				}
			}
		}
		
		sb.append(count).append("\n");
		
		for (int m : list) {
			sb.append(m).append(" ");
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
	}
}