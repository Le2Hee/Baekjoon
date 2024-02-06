import java.io.*;
import java.util.*;

public class Main {
	
	public static class Top {
		int h, num;
		
		public Top(int h, int n) {
			this.h = h;
			num = n;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Stack<Top> stack = new Stack<>();
		
		for (int i = 1; i <= n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if (stack.isEmpty()) {
				sb.append("0 ");
				stack.push(new Top(num, i));
			} else {
				while (true) {
					if (stack.isEmpty()) {
						sb.append("0 ");
						stack.push(new Top(num, i));
						break;
					}
					
					Top t = stack.peek();
					
					if (t.h > num) {
						sb.append(t.num).append(" ");
						stack.push(new Top(num, i));
						break;
					} else {
						stack.pop();
					}
				}
			}
		}
		
		System.out.println(sb);
	}
}