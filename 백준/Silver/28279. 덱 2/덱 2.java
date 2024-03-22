import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		Deque<Integer> d = new LinkedList<>();
		StringTokenizer st;
		
		int n, x;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			
			switch (n) {
			case 1 :
				x = Integer.parseInt(st.nextToken());
				d.addFirst(x);
				break;
			case 2 :
				x = Integer.parseInt(st.nextToken());
				d.addLast(x);
				break;
			case 3 :
				if (!d.isEmpty()) {
					x = d.pollFirst();
					sb.append(x).append("\n");
				} else {
					;sb.append("-1\n");
				}
				break;
			case 4 :
				if (!d.isEmpty()) {
					x = d.pollLast();
					sb.append(x).append("\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case 5 :
				sb.append(d.size()).append("\n");
				break;
			case 6 :
				if (!d.isEmpty()) {
					sb.append("0\n");
				} else {
					sb.append("1\n");
				}
				break;
			case 7 :
				if (!d.isEmpty()) {
					x = d.peekFirst();
					sb.append(x).append("\n");
				} else {
					sb.append("-1\n");
				}
				break;
			case 8 :
				if (!d.isEmpty()) {
					x = d.peekLast();
					sb.append(x).append("\n");
				} else {
					sb.append("-1\n");
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
