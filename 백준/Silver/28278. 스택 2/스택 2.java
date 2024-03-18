import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int num, x;
		Stack<Integer> s = new Stack<>();
		StringTokenizer st;
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			
			switch (num) {
			case 1 :
				x = Integer.parseInt(st.nextToken());
				s.push(x);
				break;
			case 2 :
				if (s.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					x = s.pop();
					sb.append(x).append("\n");
				}
				break;
			case 3 :
				sb.append(s.size()).append("\n");
				break;
			case 4 :
				if (s.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			case 5 :
				if (s.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					x = s.peek();
					sb.append(x).append("\n");
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